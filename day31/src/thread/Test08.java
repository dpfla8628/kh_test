package thread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.ObjectInputStream.GetField;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame08 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel();
	
	private JButton left = new JButton("버튼1");
	private JButton right = new JButton("버튼2");
	
//---------------------------------------------------------	
//	스레드 밖에 생성
	//1. left의 색을 2초마다 빨간색으로 변경
	private Runnable r1 = () ->{
		int n=0;
		while(true) {
			if(n%2==0) {//깜박이게하려고 => 3초동안 2종류로 반복돼라!
				left.setBackground(Color.red);}	//(0)->red}
			else {
				left.setBackground(null);}		//(1)->while}
			
			try {
				Thread.sleep(2000L);}
			catch(Exception e) { break; }
			//interrupted 상태가 되면 Thread.sleep()이 불가능해져서 예외가 발생하므로 반복문을 나가게 처리
			
			
			n++;
		}
	};
	private Thread t1 = new Thread(r1);
	
//--------------------------------------------------------	
	//2. right의 색을 3초마다 초록색으로 변경
	private Runnable r2 = () ->{
		int n=0;	
		while(true) {
			if(n%2==0) {//깜박이게하려고
				right.setBackground(Color.green);}
			else {
				right.setBackground(null);}
			
			try {
				Thread.sleep(3000L);}
			catch(Exception e) { break; }
			
			n++;
		}
	};
	private Thread t2 = new Thread(r2);
	
//-----------------------------------------------------------	
	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);
		this.setLayout(new GridLayout(1,2));
		
		root.add(left,BorderLayout.WEST);
		root.add(right,BorderLayout.EAST);
		
//*******스레드 실행*************************************
		t1.setDaemon(true);
		t1.start();
		t2.setDaemon(true);
		t2.start();
//***************************************************
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
		//left를 누르면 t1을 중지
		left.addActionListener(e->{
			//t1.stop(); 	//비추천 : 즉시 멈추지만 데드락(제어할 수 없는 멈추지 않는 스레드)이 발생
			t1.interrupt();	//추천 : 즉시 멈추지 않고 Thread.sleep()이 실행될 때 멈춘다
			
		});
		right.addActionListener(e ->{
			t2.interrupt();
		});
	}
		
	//생성자 : 창에 대한 설정
	public MyFrame08() {
		this.place();
		this.event();
		this.setLocation(100, 100);
		this.setSize(600, 400);
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test08 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame08 frame = new MyFrame08();
	}
}
