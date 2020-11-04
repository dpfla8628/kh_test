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
class MyFrame09_2arr extends JFrame{
	
	//제목
	private JLabel top = new JLabel("지뢰찾기",JLabel.CENTER);
	
	//가운데
	private JPanel center = new JPanel(new GridLayout(20,24));
	//바둑
	//private JButton[] bt = new JButton[20*24];//480
	private JButton[][] bt = new JButton[20][24];//480
	
	
//------------------------------------------------------------------	
//멤버 메소드	
	public void place() {
		this.setLayout(new BorderLayout());
		
		//제목
		this.add(top,BorderLayout.NORTH);
		top.setFont(new Font("궁서체",Font.BOLD,50));
		
		//가운데
		this.add(center,BorderLayout.CENTER);
		
		Color color1 = new Color(0,200,0);//연한색
		Color color2 = new Color(0,150,0);//진한색
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR); 
		int row = 20;
		int col=24;
		//바둑
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				bt[i][j]=new JButton();//버튼 추가
				//지그재그 색칠
				//홀수줄 일때는 홀수칸을 진하게 짝수칸을 연하게
				//짝수줄 일때는 홀수칸을 연하게 짝수칸을 진하게
				if(i%2!=0) {
					if(j%2!=0) {
						bt[i][j].setBackground(color1);
					}
					else {
						bt[i][j].setBackground(color2);
					}
				}
				else {
					if(j%2!=0) {
						bt[i][j].setBackground(color2);
					}
					else {
						bt[i][j].setBackground(color1);
					}
				}
				bt[i][j].setCursor(cursor);
				center.add(bt[i][j]);
			}
		}
			
	}	
//--------------------------------------------------------------------	
//생성자 : 창에 대한 설정
	public MyFrame09_2arr() {
		this.place();
		this.setTitle("GUI예제09_2arr_arr");
		this.setLocation(300,100);
		this.setSize(400,400);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}

public class Test09_2arr {
	public static void main(String[] args) {
		MyFrame09_2arr f = new MyFrame09_2arr();
		
		
	}
}
