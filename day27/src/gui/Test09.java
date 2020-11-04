package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//------------------------------------------------------------------
//멤버 변수
class MyFrame09 extends JFrame{
	
	//제목
	private JLabel top = new JLabel("지뢰찾기",JLabel.CENTER);
	
	//가운데
	private JPanel center = new JPanel(new GridLayout(20,24));
	//바둑
	private JButton[] bt = new JButton[20*24];//480
	
	
//------------------------------------------------------------------	
//멤버 메소드	
	public void place() {
		this.setLayout(new BorderLayout());
		
		//제목
		this.add(top,BorderLayout.NORTH);
		top.setFont(new Font("궁서체",0,50));
		
		//가운데
		this.add(center,BorderLayout.CENTER);

		Color color = new Color(71,200,62);
		//바둑
		for(int i=0; i<bt.length; i++) {
			bt[i]=new JButton();//버튼 추가
			bt[i].setBackground(color);
			center.add(bt[i]);
		}	
	}	
//--------------------------------------------------------------------	
//생성자 : 창에 대한 설정
	public MyFrame09() {
		this.place();
		this.setTitle("GUI예제09");
		this.setLocation(300,100);
		this.setSize(400,400);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}

public class Test09 {
	public static void main(String[] args) {
		MyFrame09 f = new MyFrame09();
		
		
	}
}
