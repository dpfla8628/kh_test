package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test03 {
	public static void main(String[] args) {
		
		//Frame 생성 코드
		JFrame frame = new JFrame();
		frame.setTitle("자바 그래픽 예제");
		frame.setLocation(300,300);
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//GridLayout을 이용하여 컴포넌트 배치하는 방법
		//:행과 열을 지정
		//GridLayout layout = new GridLayout(2,2);
		GridLayout layout = new GridLayout(2,2,5,5);//2행2열 수평5px 수직5px
		
		frame.setLayout(layout);
		
		JButton a = new JButton("a버튼");
		JButton b = new JButton("b버튼");
		JButton c = new JButton("c버튼");
		JButton d = new JButton("d버튼");
		
		//각각의 컴포넌트들은 단 한번만 추가 가능! 중복 불가!!(Set이랑 비슷)
		frame.add(a);
		frame.add(b);
		frame.add(c);
		frame.add(d);
		
		//Frame 표시 코드
		frame.setVisible(true);
		
		
	}
}
