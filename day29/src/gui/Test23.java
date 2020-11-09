package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame23 extends JFrame{
	
//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel();
	
	private JTextArea screen = new JTextArea();
	
	private JPanel center = new JPanel(new GridLayout(4,3));
	private JButton[] num = new JButton[4*3];

	
	private JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JButton call = new JButton("통화");
	private JButton back = new JButton("지우기");

//----------------------------------------------------------------
//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);	
	
		root.setLayout(new BorderLayout());
		root.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		root.add(screen,BorderLayout.NORTH);
		screen.setBorder(new LineBorder(Color.black,2,true));
		screen.setFont(new Font("돋움체", Font.BOLD, 30));
		
		root.add(center,BorderLayout.CENTER);
		List<Integer> numbers = new ArrayList<>();
		for(int i=1; i<=12; i++) {
			numbers.add(i);
		}

		for(int i=0; i<num.length; i++) {
			num[i]=new JButton();//버튼 추가
			num[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
			num[i].setText(""+numbers.get(i));
			center.add(num[i]);
			switch(i) {
			case 9 : num[i].setText("*");center.add(num[i]);break;
			case 10 : num[i].setText("0");center.add(num[i]);break;
			case 11 : num[i].setText("#");center.add(num[i]);break;
			}
		}
		
		
		root.add(bottom,BorderLayout.SOUTH);
		bottom.add(call);
		call.setBackground(Color.green);
		call.setPreferredSize(new Dimension(80,35));
		bottom.add(back);
		back.setBackground(Color.red);
		back.setPreferredSize(new Dimension(80,35));
		
	}
//----------------------------------------------------------------	
//멤버 메소드 : 이벤트 설정
	public void event() {
		
//화면	
//		MouseListener mou0 = new MouseAdapter() {	
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				String text = num[0].getText();
//				screen.append(String.valueOf(Integer.parseInt(text)));}
//		};num[0].addMouseListener(mou0); ....
		
		//getActionCommand : 버튼의 글자값을 String으로 바꾼다
		ActionListener listener = (e)->{
			screen.append(e.getActionCommand());
		};
		for(int i=0; i<num.length;i++) {
			num[i].addActionListener(listener);
		}	
		
//통화
		call.addActionListener (e->{
			JOptionPane.showMessageDialog(null, screen.getText()+"전화 연결중");
		});
//지우기
		back.addActionListener(e ->{
			screen.setText("");
		});
	}
		

	//생성자 : 창에 대한 설정
	public MyFrame23() {
		this.place();
		this.event();
		this.setTitle("GUI 예제 23");
		this.setLocation(100, 100);
		this.setSize(250, 350);
		//this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test23 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame23 frame = new MyFrame23();
	}
}