package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test04 {
	public static void main(String[] args) {
		
		//Frame 생성 코드
		JFrame frame = new JFrame();
		frame.setTitle("자바 그래픽 예제");
		frame.setLocation(300,300);
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//BorderLayout을 이용해서 Component 배치
		//:방향을 기준으로 배치
		BorderLayout layout = new BorderLayout();
		frame.setLayout(layout);
		
		JButton a = new JButton("a버튼");
		JButton b = new JButton("b버튼");
		JButton c = new JButton("c버튼");
		JButton d = new JButton("d버튼");
		JButton e = new JButton("e버튼");
		
		frame.add(a,BorderLayout.NORTH);//북
		frame.add(b,BorderLayout.WEST);//서
		frame.add(c,BorderLayout.EAST);//동
		frame.add(d,BorderLayout.SOUTH);//남
		frame.add(e,BorderLayout.CENTER);//가운데
		
		//Frame 표시 코드
		frame.setVisible(true);
		
		
	}
}
