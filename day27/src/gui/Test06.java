package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test06 {
	public static void main(String[] args) {
		
		//Frame 생성 코드
		JFrame frame = new JFrame();
		frame.setTitle("자바 그래픽 예제");
		frame.setLocation(300,300);
		frame.setSize(250,150);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
		//2_1
		//= JPanel panel1 = new JPanel(new BorderLayout());
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		//아이디
		JLabel id = new JLabel("아이디", JLabel.CENTER);
		panel1.add(id,BorderLayout.WEST);
		//글자 입력창1
		JTextField idt = new JTextField();
		panel1.add(idt,BorderLayout.CENTER);
		
		
		//2_2
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		//비번
		JLabel pass = new JLabel("비번",JLabel.CENTER);
		panel2.add(pass,BorderLayout.WEST);
		//글자 입력창2
		JTextField passt = new JTextField();
		panel2.add(passt,BorderLayout.CENTER);	
		
		
		//2_3
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		//로그인
		JButton log = new JButton("Login");
		panel3.add(log);
		
		//1
		frame.setLayout(new GridLayout(3,1,10,10));
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		
		//폭 설정
		id.setPreferredSize(new Dimension(100,50));
		pass.setPreferredSize(new Dimension(100,50));
		
		//Frame 표시 코드
		frame.setVisible(true);
		
		
	}
}
