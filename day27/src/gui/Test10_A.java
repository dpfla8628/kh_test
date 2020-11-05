package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
//swing이 최신
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
class MyFrame10_A extends JFrame{
//------------------------------------------------------------------	
//멤버 변수	
	
	//파넬은 한개만 있으면 된다 유리벽같은 존재라서 마지막 버튼을 오른쪽으로 옮겨주기 위해서만 사용할거라서
	//JPanel은 FlowLayout이랑 짝꿍이라서 죄우 정렬할 때 이용할다
	
	//제목
	private JLabel top1 = new JLabel("설문조사",JLabel.CENTER);
	private JLabel top2 = new JLabel("내가 가장 좋아하는 자바 분야는?",JLabel.LEFT);
	
	//가운데
	//어차피 전체를 GridLayout으로 볼거라서 따로 JPanel으로 Grid를 설정할 필요는 없다
	private JCheckBox r1 = new JCheckBox("상속");
	private JCheckBox r2 = new JCheckBox("다형성");
	private JCheckBox r3 = new JCheckBox("파일 입출력");
	
	//아래
	//버튼은 오른쪽 정렬인데 BorderLayout에서는 설정을 못하니까
	//JPanel으로 묶어줘서 FlowLayout을 이용해 유리벽을 한층 올려줘서 적용시킨다
	private JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	private JButton bt = new JButton("제출");
	
	
//------------------------------------------------------------------	
//멤버 메소드	
	public void place() {
		this.setLayout(new GridLayout(6,1));
		
		//제목1
		this.add(top1);
		top1.setFont(new Font("돋움체",Font.BOLD,20));
		//제목2
		this.add(top2);
		top2.setFont(new Font("돋움체",0,15));
		
		//가운데
		this.add(r1);
		this.add(r2);
		this.add(r3);
		
		//아래
		this.add(bottom,BorderLayout.SOUTH);
		bottom.add(bt);
		
	}	
//--------------------------------------------------------------------	
//생성자 : 창에 대한 설정
	public MyFrame10_A() {
		this.place();
		this.setTitle("GUI예제10");
		this.setLocation(300,100);
		this.setSize(400,200);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}

public class Test10_A {
	public static void main(String[] args) {
		MyFrame10_A f = new MyFrame10_A();		
	}
}
