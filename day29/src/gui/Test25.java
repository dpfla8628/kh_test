package gui;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame25 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();
	
	private JButton[] bt = new JButton[4];
	//버튼 이름만 따로 배열에 만들어서  넣어주기
	private String[] title = new String[] {
		"버튼1","버튼2","버튼3","버튼4"
	};
	
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		
		for(int i=0; i<bt.length; i++) {
			bt[i] = new JButton(title[i]);
			root.add(bt[i]);
		}
		
		
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
			
		//컴포넌트 1개에 이벤트 1개를 연결했으나 통합해야 하는 경우도 있다
//		bt[0].addActionListener(e -> {
//			System.out.println("버튼1");
//		});
		
//1.ActionListener로 묶어주자!	
		ActionListener listener1 = e->{
			System.out.println("1. 이벤트 발생!");
		};
		for(int i=0; i<bt.length; i++) {
			bt[i].addActionListener(listener1);
		}
//2.e.getActionCommand() : 이벤트 발생한 컴포넌트의 글자(String)를 반환(ActionListener에만 있음)
		ActionListener listener2 = e ->{
			//System.out.println("2. 이벤트 발생!");
		
		switch(e.getActionCommand()) {
		case "버튼1": 
			setTitle("버튼1누름");
			root.setBackground(Color.CYAN);
			break;
		case "버튼2":
			break;
		case "버튼3":
			break;
		case "버튼4":
			break;
		}
//e.getSource() : 이벤트 발생한 컴포넌트 객체(Object)를 반환
		//equals안쓰고 ==를 썼다! 버튼이  bt[0]이랑 완전히 똑같으면~
		if(e.getSource() == bt[0]) {
			System.out.println("버튼1번 감지");
	}
		
		};
		for(int i=0; i<bt.length; i++) {
			bt[i].addActionListener(listener2);
		}
		
		
		
}
	
		
	//생성자 : 창에 대한 설정
	public MyFrame25() {
		this.place();
		this.event();
		this.setTitle("GUI 예제 25");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test25 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame25 frame = new MyFrame25();
	}
}
