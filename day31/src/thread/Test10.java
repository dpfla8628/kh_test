package thread;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.Format;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import com.jtattoo.plaf.mcwin.McWinLookAndFeel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame10 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();

	private int time = 0;						//기본 time = 0
	
	private JLabel lcd = new JLabel("", JLabel.CENTER);
	
	private JButton start = new JButton("시작");
	private JButton stop = new JButton("정지");
	private JButton reset = new JButton("초기화");

//**********************************************************
	//여기서 새로 생성한 StopWatch는 Thread의 기능을 갖고 있음
	class Stopwatch extends Thread{
		//계속 쓰는거니까 아예 생성사에 넣어준다
		public Stopwatch() {
			this.setDaemon(true);	
		}
		@Override
		public void run() {
			try {
				while(true) {						//---------------
					display(time+1);				//Thread run()생성|
													//---------------
					Thread.sleep(10L);				
					}
				}
				catch(Exception ex) {}	
		}
	}
	//Thread 대신 StopWatch 사용
	private Stopwatch t;
	
//**********************************************************
	//이 기능은 메인 스레드와 t라는 스레드가 동시에 접근하는 기능이다
	//혹시 순서가 꼬여서 오류가 발생할까 두렵다면 성능을 포기하고 줄서서 들어오게 만들 수 있다. 오류 줄일 수 있음
	//자바에서는 synchronized라는 키워드를 통해 자동으로 줄을 서서 이용할 수 있도록 처리해준다
	//synchronized 키워드를 사용하려면 스레드가 여러개 있어야한다
	public synchronized void display(int time) {
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
//**********************************************************
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
			t = new Stopwatch();
//			t.setDaemon(true); 위치이동
			t.start();							
		});
		
//		정지버튼
		stop.addActionListener(e->{
			t.interrupt();
			start.setEnabled(true);//시작버튼 활성화
			stop.setEnabled(false);//정지버튼 활성화
	});
		
//		초기화버튼
		reset.addActionListener(e->{
			//main꺼 사용중
			display(0);
		});
}
//**********************************************************	

	//생성자 : 창에 대한 설정
	public MyFrame10() {
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

public class Test10 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		try {
			UIManager.setLookAndFeel(new McWinLookAndFeel());
		}
		catch(Exception e) {
			System.err.println("스킨을 불러올 수 없습니다");
		}
		MyFrame10 frame = new MyFrame10();
	}
}