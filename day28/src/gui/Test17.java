package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame17 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();
	
	private JButton bt = new JButton("0");
	
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		this.setContentPane(root);
		
		root.setLayout(new GridLayout());
		
		root.add(bt,BorderLayout.CENTER);
		bt.setFont(new Font("",Font.BOLD,100));
	}
	
	public void event() {
	
		MouseListener mou = new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				bt.setBackground(Color.white);//=null
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				bt.setBackground(Color.yellow);
			}
			//bt에 있는 :"0"은 문자열이기 때문에 integer.valueOf를 통해 정수 데이터 타입으로 반환하여준다
			//								  .parseInt도 같은거임
			@Override
			public void mouseClicked(MouseEvent e) {
				String text = bt.getText();
				//bt.setText(String.valueOf(Integer.valueOf(text)+1));
				bt.setText(Integer.toString(Integer.parseInt(text)+1));
				
				
			}
		};
		bt.addMouseListener(mou);
	}
	
	
	//생성자 : 창에 대한 설정
	public MyFrame17() {
		this.place();
		this.event();
		this.setTitle("GUI 예제 17");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test17 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame17 frame = new MyFrame17();
	}
}
