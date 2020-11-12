

//카드 뒤집기 정답 만들어보기

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

class MyButton extends JButton{
	private boolean press;
	private int value;
	private ImageIcon back,front;
	
	public MyButton(int value,ImageIcon back,ImageIcon front) {
		this.value = value;
		this.front=front;
		this.back = back;
		display();
	}
	public int getValue() {
		return this.value;
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
class MyFrame34 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();
	
	//아이콘(Icon) : 이미지의 종류이긴 하지만 컴포넌트에 집어넣는 형태로 특화된 이미지
//	// - 크기변경이 불가능하며 바꾸고 싶다면 Image로 변환하여 조정한 뒤 다시 되돌려야 한다
//	private ImageIcon icon1 = new ImageIcon("image/icon0.png");
//	private ImageIcon icon2 = new ImageIcon("image/icon1.png");

	private List<MyButton> list = new ArrayList<>();
	
	private int row=2;
	private int col=3;
	
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		
		root.setLayout(new GridLayout(row,col));
		
		ImageIcon back = new ImageIcon("image/back.png");
		for(int i=0; i<row*col; i++) {
			
			ImageIcon front = new ImageIcon("image/icon"+(i/2)+".png");
			MyButton bt = new MyButton((i/2),back,front);//0,0,1,1
			
			bt.setFont(new Font("굴림",Font.BOLD,50));
			list.add(bt);
		}
		Collections.shuffle(list);//셔플을 사용하려면 리스트를 이용하자
	
		for(MyButton bt : list) {
			root.add(bt);
		}
	}
	
	//첫번째 버튼만큼은 기억하고 있어야하니까 따로 변수 선언해준다
	private MyButton first;
	
	//멤버 메소드 : 이벤트 설정
	public void event() {
		//목표 : 버튼을 누르면 아이콘이 나타났다 사라졌다 하도록 구현
		//e.getactionCommand() : 버튼의 글자를 불러온다
		//e.getSource() : 버튼을 불러온다
		
		//숫자랑 이미지랑 같이 나오는 문제점을 해결해보자!
		//버튼클래스를 확장해서 값을 변수로 추가해보자

		
		ActionListener listener = e ->{
			MyButton target = (MyButton)e.getSource();//다운캐스팅
			target.setPress(true);
			
			if(first==null) {
				//System.out.println("첫번째 버튼");
				first=target;
				
			}
			else {
				//System.out.println("두번째 버튼");
				//	1.같은 버튼을 누른게 아니라면     2.텍스트 값이 같다면
				if(first!=target && first.getValue() == target.getValue()) {//똑같은 버튼을 눌렀다면) {
					first.setEnabled(false);//첫번째 버튼 잠금
					target.setEnabled(false);//두번째 버튼잠금
				}
				else {
					first.setPress(false);
					target.setPress(false);
				}
				first=null;
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
	public MyFrame34() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("GUI 예제 34");
		this.setLocation(100, 100);
		this.setSize(400, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);
	}
}

public class Test34 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame34 frame = new MyFrame34();
	}
}