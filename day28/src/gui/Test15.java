package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame15 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel(new GridLayout(2,1));
	
	private JLabel la = new JLabel("Holle Java!",JLabel.CENTER);
	private JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JButton red = new JButton("빨강");
	private JButton blue = new JButton("파랑");
	private JButton exit = new JButton("종료!");
	
	
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		
		//JLabel은 기본적으로 투명색이라 배경색을 지정해주려면 
		//배경을 불투명하게 만들어주는 setOpaque명령어가 필요
		la.setOpaque(true);
		Color color = new Color(0x550000FF,true);//true:투명도
		la.setBackground(color);
		
		root.add(la);
		
		root.add(bottom,BorderLayout.SOUTH);
		bottom.add(red);
		bottom.add(blue);
		bottom.add(exit);
	}
	
	//멤버 메소드 :  이벤트 설정
	//설정해야할 이벤트 3개! 처리 객체(ActionListener)3개! 연결 코드 3개!
/****/public void event() {	

		ActionListener a =(e) ->{
			la.setForeground(Color.red);
			la.setFont(new Font("궁서체",Font.BOLD,20));
		};
		red.addActionListener(a);
	
	
		ActionListener b =(e) ->{
			la.setForeground(Color.blue);
		};
		blue.addActionListener(b);
	
		
		ActionListener c =(e) ->{
			dispose();//창닫기
			//System.exit(0);//시스템을 종료하는 코드
		};
		exit.addActionListener(c);
		
	}
	
	
	
	//생성자 : 창에 대한 설정
	public MyFrame15() {
		this.place();
		this.event();
		this.setTitle("GUI 예제 15");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test15 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame15 frame = new MyFrame15();
	}
}
