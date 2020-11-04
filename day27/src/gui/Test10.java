package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
class MyFrame10 extends JFrame{
//------------------------------------------------------------------	
//멤버 변수	
	//제목
	private JPanel top = new JPanel(new GridLayout(2,1));
	private JLabel top1 = new JLabel("설문조사",JLabel.CENTER);
	private JLabel top2 = new JLabel("내가 가장 좋아하는 자바 분야는?",JLabel.CENTER);
	
	//가운데
	private JPanel center = new JPanel(new GridLayout(3,1));
	private JCheckBox r1 = new JCheckBox("상속");
	private JCheckBox r2 = new JCheckBox("다형성");
	private JCheckBox r3 = new JCheckBox("파일 입출력");
	
	//아래
	private JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	private JButton bt = new JButton("제출");
	
	
//------------------------------------------------------------------	
//멤버 메소드	
	public void place() {
		this.setLayout(new GridLayout(3,1));
		
		//제목1
		this.add(top);
		top.add(top1);
		top1.setFont(new Font("돋움체",Font.BOLD,20));
		//제목2
		this.add(top);
		top.add(top2);
		top2.setFont(new Font("돋움체",0,15));
		
		//가운데
		this.add(center);
		center.add(r1);
		center.add(r2);
		center.add(r3);
		
		//아래
		this.add(bottom,BorderLayout.SOUTH);
		bottom.add(bt);
		
	}	
//--------------------------------------------------------------------	
//생성자 : 창에 대한 설정
	public MyFrame10() {
		this.place();
		this.setTitle("GUI예제10");
		this.setLocation(300,100);
		this.setSize(400,200);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}

public class Test10 {
	public static void main(String[] args) {
		MyFrame10 f = new MyFrame10();		
	}
}
