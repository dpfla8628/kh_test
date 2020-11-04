package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test05 {
	public static void main(String[] args) {
		
		//Frame 생성 코드
		JFrame frame = new JFrame();
		frame.setTitle("자바 그래픽 예제");
		frame.setLocation(300,300);
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//1층 : JFrame - BorderLayout
		//2층 : JPanel - GridLayout
		JPanel panel = new JPanel();
		GridLayout g = new GridLayout(1,2);
		panel.setLayout(g);
		
		JButton yes = new JButton("예");
		JButton no = new JButton("아니오");
		
		panel.add(yes);
		panel.add(no);
		
		//1층은 BorderLayout으로 설정(안해도 기본값이 BorderLayout)
		BorderLayout b = new BorderLayout();
		frame.setLayout(b);
				
		//2층을 1층의 south에 배치
		frame.add(panel, BorderLayout.SOUTH);
		
		//1층의 center에는 JLabel을 배치
		JLabel label = new JLabel("종료하시겠어요?");
		frame.add(label,BorderLayout.CENTER);
		
		//Frame 표시 코드
		frame.setVisible(true);
		
		
	}
}
