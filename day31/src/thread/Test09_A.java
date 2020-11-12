package thread;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.Format;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import com.jtattoo.plaf.mcwin.McWinLookAndFeel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame09_A extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();

	private int time = 0;						//기본 time = 0
	
	private JLabel lcd = new JLabel("", JLabel.CENTER);
	
	private JButton start = new JButton("시작");
	private JButton stop = new JButton("정지");
	private JButton reset = new JButton("초기화");
	
//**********************************	
	private Runnable r = ()->{
		try {
			while(true) {						//------------------
				display(time+1);				//Runnable Thread생성|
												//------------------
				Thread.sleep(10L);				
				}
			}
			catch(Exception ex) {}
		};
	private Thread t;
//***********************************
	public void display(int time) {
		this.time=time;
		
		//시간계산
		int minute = this.time/100/60;			//--------------------
		int second = this.time/100;				//time시간 설정! 모양 만들기|
		int millis = this.time%100;				//--------------------
		
		//숫자는 DecimalFormat으로 형식을 제어할 수 있다.
		//- 0을 배치하면 해당 자리가 비었을 때 0으로 출력
		Format f = new DecimalFormat("00");
		
		String text = f.format(minute) + "분 " + f.format(second) + "초 " + f.format(millis);
	
		lcd.setText(text);
	}
	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);
		
		//layout을 null로 설정하면 모든 컴포넌트에 좌표를 부여해서 배치가 가능
		// - 복잡한 화면에 유리함
		root.setLayout(null);
		
		root.add(lcd);
		root.add(start);
		root.add(stop);
		root.add(reset);
		
		lcd.setBounds(10, 10, 280, 100);
		Font font = new Font("굴림", Font.BOLD, 40);
		lcd.setFont(font);
		display(0);								//lcd의 display형태의 시간을 0으로 설정
		
		start.setBounds(300, 10, 80, 30);
		stop.setBounds(300, 45, 80, 30);
		reset.setBounds(300, 80, 80, 30);
		
		
//		처음에 셋팅할 때 stop은 누르지 못하게 한다
		stop.setEnabled(false);
	}
//**********************************************************
	//멤버 메소드 : 이벤트 설정
	public void event() {
	
//		시작버튼
		start.addActionListener(e->{
			start.setEnabled(false);//시작버튼 비활성화
			stop.setEnabled(true);
	
			//스레드는 1회용이기대문에 같은 작업을 계속 해야된다면 신규로 생성해야함
			t = new Thread(r);					//-------------------------
			t.setDaemon(true);					//시작 버튼(start) Thread재사용|
			t.start();							//-------------------------
		});
		
//		정지버튼
		stop.addActionListener(e->{
			t.interrupt();
			start.setEnabled(true);//시작버튼 활성화
			stop.setEnabled(false);//정지버튼 활성화
	});
		
//		초기화버튼
		reset.addActionListener(e->{
			display(0);
		});
}
	

	//생성자 : 창에 대한 설정
	public MyFrame09_A() {
		this.place();
		this.event();
		this.setTitle("초시계");
		this.setLocation(100, 100);
		this.setSize(400, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}

public class Test09_A {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		try {
			UIManager.setLookAndFeel(new McWinLookAndFeel());
		}
		catch(Exception e) {
			System.err.println("스킨을 불러올 수 없습니다");
		}
		MyFrame09_A frame = new MyFrame09_A();
	}
}