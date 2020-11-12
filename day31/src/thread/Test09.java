package thread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;


//나만의 창 클래스 템플릿(기본폼)
class MyFrame09 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel();
	int j=0;
	int i=0;
	
	private JLabel txt = new JLabel("00초00",JLabel.CENTER);
	
	private JPanel bt = new JPanel(new GridLayout(3,1));
	private JButton start = new JButton("시작");
	private JButton stop = new JButton("정지");
	private JButton reset = new JButton("초기화");
	
//---------------------------------------------------------	
//	스레드 밖에 생성
	//숫자 증가하기
	private Runnable r1 = () ->{
		
		//여기에 변수 숫자값 0을 넣어버리면 시작 버튼을 누를 때 이 스레드가 시작되면서 
		//정지를 누르고 시작을 누를 때 초기화가 돼버린다! 따라서 밖에 변수를 넣어줘야한다
		while(true) {i++;
			if(i==99) {
				j++;
				i=0;
			}
			txt.setText(String.format("%02d초%02d",j,i));
			try {
				Thread.sleep(10L);}
			catch(Exception e) { break; }
		} 
	};
	private Thread t;
	//공용된 변수 사용을 위해 밖에 설정해준다~~~

	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);
		this.setLayout(new GridLayout(1,2));
		
		root.add(txt,BorderLayout.CENTER);
		txt.setFont(new Font("궁서체",0,50));
		txt.setBorder(new LineBorder(Color.blue,3,false));
		txt.setOpaque(true);
		txt.setBackground(Color.pink);
		
		root.add(bt);
		bt.add(start);
		bt.add(stop);
		bt.add(reset);
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
		
		start.addActionListener(e->{
			t = new Thread(r1);
			t.setDaemon(true);
			t.start();
		});
		stop.addActionListener(e->{
			t.interrupt();
		});
		reset.addActionListener(e->{
			txt.setText("00초00");
		});
	
	}
		
	//생성자 : 창에 대한 설정
	public MyFrame09() {
		this.place();
		this.event();
		this.setLocation(100, 100);
		this.setSize(500, 200);
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test09 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		}
		catch(Exception e) {}
		MyFrame09 frame = new MyFrame09();
	}
}
