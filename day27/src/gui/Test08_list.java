package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame08_1 extends JFrame{//멤버 변수
	
	//제목
	private JLabel time = new JLabel("남은 시간 : 2분 30초",JLabel.CENTER);
	
	//가운데
	private JPanel center = new JPanel(new GridLayout(5,5));
	//바둑
	private List<JButton> list = new ArrayList<>();//리스트
	
	//아래버튼
	private JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	private JButton check = new JButton("확인");
	private JButton re = new JButton("다시");
	private JButton close = new JButton("닫기");
	
//------------------------------------------------------------------	
	
	public void place() {//멤버 메소드
		this.setLayout(new BorderLayout());
		
		//제목
		this.add(time,BorderLayout.NORTH);
		
		//가운데
		this.add(center,BorderLayout.CENTER);
		//바둑
		for(int i=0; i<25; i++) {
			list.add(new JButton());
			center.add(list.get(i));
		}
		
		//아래 버튼
		this.add(bottom,BorderLayout.SOUTH);
		bottom.add(check);
		bottom.add(re);
		bottom.add(close);
		
	}	
//--------------------------------------------------------------------	
	//생성자 : 창에 대한 설정
	public MyFrame08_1() {
		this.place();
		this.setTitle("GUI예제08");
		this.setLocation(300,100);
		this.setSize(400,400);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}

public class Test08_list {
	public static void main(String[] args) {
		MyFrame08_1 f = new MyFrame08_1();
		
		
	}
}
