package gui;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


class MyFrame20 extends JFrame{
	
//멤버 변수 
	private JPanel root = new JPanel();
	
	private JTextArea area = new JTextArea();
	private JScrollPane scroll = new JScrollPane(area);
	
	
//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);
		
		root.setLayout(new BorderLayout());
		
		root.add(scroll);
	}
	
	
//멤버 메소드 : 이벤트 설정
	public void event() {
		//f5누르면 현재 시간 출력
		KeyListener k = new KeyAdapter() {
	
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_F5) {
					Date d = new Date();
					SimpleDateFormat s = new SimpleDateFormat("a hh:mm yyyy-mm-dd");
					System.out.println(s.format(d));
				}
			}
		};
		//종료버튼 클릭시 글자가 있다면 다음 알림창을 표시
		WindowListener w = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(!(area.getText().isEmpty())) {
					JOptionPane.showMessageDialog(area, "저장하지 않은 내용이 사라집니다");
				}
				dispose();
			}
		};
		area.addKeyListener(k);
		this.addWindowListener(w);
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame20() {
		this.place();
		this.event();
		this.setTitle("GUI 예제 20");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test20 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame20 frame = new MyFrame20();
	}
}
