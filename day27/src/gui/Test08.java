package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//------------------------------------------------------------------
//멤버 변수
class MyFrame08 extends JFrame{
	
	//제목
	private JLabel time = new JLabel("남은 시간 : 2분 30초",JLabel.CENTER);
	
	//가운데
	private JPanel center = new JPanel(new GridLayout(5,5));
	//바둑
	private JButton[] bt = new JButton[25];//버튼이 25개 들어갈 배열의 자리를 만든것
										   //초기화는 메소드에서 가능
	
	//아래버튼
	private JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	private JButton check = new JButton("확인");
	private JButton re = new JButton("다시");
	private JButton close = new JButton("닫기");
	
//------------------------------------------------------------------	
//멤버 메소드	
	public void place() {
		this.setLayout(new BorderLayout());
		
		//제목
		this.add(time,BorderLayout.NORTH);
		
		//가운데
		this.add(center,BorderLayout.CENTER);
		//바둑 랜덤 숫자
		List<Integer> numbers = new ArrayList<>();
		for(int i=1; i<=25; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		//바둑
		for(int i=0; i<bt.length; i++) {
			bt[i]=new JButton();//버튼 추가
			bt[i].setBackground(new Color(255,255,255));//=white
			bt[i].setCursor(new Cursor(Cursor.HAND_CURSOR));//손모양 커서
			bt[i].setText("" + numbers.get(i));//문자열을 하나 더해주면 문자열이됨
			center.add(bt[i]);}

		
		//아래 버튼
		this.add(bottom,BorderLayout.SOUTH);
		bottom.add(check);
		bottom.add(re);
		bottom.add(close);
		
	}	
//--------------------------------------------------------------------	
//생성자 : 창에 대한 설정
	public MyFrame08() {
		this.place();
		this.setTitle("GUI예제08");
		this.setLocation(300,100);
		this.setSize(400,400);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}

public class Test08 {
	public static void main(String[] args) {
		MyFrame08 f = new MyFrame08();
		
		
	}
}
