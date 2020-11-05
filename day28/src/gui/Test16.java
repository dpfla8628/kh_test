package gui;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame16 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();
	
	private JButton bt = new JButton("눌러!");
//-------------------------------------------------------
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		this.setContentPane(root);
		
		root.add(bt);
		bt.setPreferredSize(new Dimension(200,80));//사이즈 설정
	}
	public void event() {
		//추상메소드라서 5개의 메소드중 하나라도 없으면 오류난다
		//하나만 사용하고 싶으면 MouseAdapter사용!
		MouseListener mou = new MouseAdapter() {
			@Override//마우스 눌렀다가 그 자리에서 떼는거
			public void mouseClicked(MouseEvent e) {
				System.out.println("click");
				dispose();
			}
		};
		bt.addMouseListener(mou);
		
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame16() {
		this.place();
		this.event();
		this.setTitle("GUI 예제 16");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test16 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame16 frame = new MyFrame16();
	}
}
