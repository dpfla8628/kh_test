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


class MyFrame20A extends JFrame{
	
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
				switch(e.getKeyCode()) {
					case KeyEvent.VK_F5:
						Date d = new Date();
						SimpleDateFormat s = new SimpleDateFormat("a hh:mm yyyy-MM-dd");
						//area.setText(s.format(d)); 	=>덮어쓰기
						//area.append(s.format(d)); 	=>붙여쓰기
						area.insert(s.format(d),area.getCaretPosition());//=>중간삽입
						break;
					case KeyEvent.VK_F6:
					case KeyEvent.VK_F7:
					//.....
				}
			}
		};
		area.addKeyListener(k);
		
		//종료버튼 클릭시 글자가 있다면 다음 알림창을 표시
		WindowListener w = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(area.getText().isEmpty()) {
					dispose();
				}
				else {
					//JOptionPane.showMessageDialog(root, "저장하지 않은 내용이 사라집니다");
					int result = JOptionPane.showConfirmDialog(null,"저장하시겠습니까?","제목",JOptionPane.YES_NO_OPTION);
					if(result==JOptionPane.YES_OPTION) {//예(0)
						dispose();
					}
					else if (result==JOptionPane.NO_OPTION) {//아니오(1)
						dispose();
					}
					else {//취소(2,-1)
						//아무것도 안함
					}
				}
			}
		};
		this.addWindowListener(w);
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame20A() {
		this.place();
		this.event();
		this.setTitle("GUI 예제 20A");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test20A {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame20A frame = new MyFrame20A();
	}
}
