package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//버튼에 각종 상태를 넣기 위해 버튼을 확장
class MyButton extends JButton{
	private boolean press;
	private int value;
	private ImageIcon back, front;
	public MyButton(int value, ImageIcon back, ImageIcon front) {
		this.value = value;
		this.back = back;
		this.front = front;
		display();
	}
	public void setPress(boolean press) {
		this.press = press;
		display();
	}
	public boolean isPress() {
		return this.press;
	}
	public void toggle() {
		this.press = !this.press;
		display();
	}
	public int getValue() {
		return this.value;
	}
	public void display() {
		if(press) {
			setIcon(front);
		}
		else {
			setIcon(back);
		}
	}
}

//나만의 창 클래스 템플릿(기본폼)
class MyFrame01 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();
	
	//버튼
	private List<MyButton> list = new ArrayList<>();
	
	private int row = 2;
	private int col = 3;

	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		
		root.setLayout(new GridLayout(row, col));
		Font font = new Font("굴림", Font.BOLD, 50);
		
		//버튼을 순서대로 만들고(0,0,1,1,...)
		ImageIcon back = new ImageIcon("image/card/back.png");
		for(int i=0; i < row*col; i++) {
			ImageIcon front = new ImageIcon("image/card/pic"+(i/2)+".jpg");
			MyButton bt = new MyButton(i/2, back, front);
			bt.setFont(font);
			list.add(bt);
		}
		
		//셔플
		Collections.shuffle(list);
		
		//추가
		for(JButton bt : list) {
			root.add(bt);
		}
		
	}
	
	//첫번째 버튼만큼은 기억하고 있어야 하니까 변수로 만든다
	private MyButton first;
	
	//멤버 메소드 : 이벤트 설정
	public void event() {
		
		ActionListener listener = e -> {
			//무조건 이벤트가 발생한 버튼이 뭔지 알아내야 한다(그래야 잠금이 가능)
			MyButton target = (MyButton)e.getSource();
			target.setPress(true);
			
			if(first == null) {
				first = target;//기억
			}
			else {
				//동일한 버튼이 아니고 글자만 같은 버튼이라면
				if(first != target && first.getValue() == target.getValue()) {
					first.setEnabled(false);//첫번째 버튼 잠금
					target.setEnabled(false);//두번째 버튼 잠금
				}
				else {
					first.setPress(false);
					target.setPress(false);
				}
				
				first = null;//초기화
			}
			
		};
		for(MyButton bt : list) {
			bt.addActionListener(listener);
		}
	}
	
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame01() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("기억력 테스트");
		this.setLocation(100, 100);
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}

public class Test01 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame01 frame = new MyFrame01();
	}
}