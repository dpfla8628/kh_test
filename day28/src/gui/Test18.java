package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame18 extends JFrame{
	
//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();
	
	//JTextField는 한줄만 입력이 가능하다
	//여러줄 입력이 필요한 경우에는 JTextArea사용
	//메모장이랑 다른점은 스크롤이 없다는것이다!
	//스크롤 지원 공간인 JScrollPane과 조합하여 사용한다
	private JTextArea area = new JTextArea();
	private JScrollPane scroll = new JScrollPane(area);//area의 양이 늘어나면 스크롤 생성해라
	
	
//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		this.setContentPane(root);
		
		root.setLayout(new BorderLayout());
		
		//테두리 만들어보자~
		Border line = BorderFactory.createLineBorder(Color.red,10,false);
		area.setBorder(line);
		
		root.add(scroll);
	}
	
	
//멤버 메소드 : 이벤트 설정
	//KeyPress(키보드 누를 때) / KeyRelease(키보드 땠을 때) : ASCII 감지 + 특수키 감지
	//keyType(문자 누를 때) : Unicode 감지 -> 문자키에만 반응한다 잘 안씀!
	public void event() {
		KeyListener k = new KeyAdapter() {
	
			@Override
			public void keyPressed(KeyEvent e) {
				//여기서 궁금한거?
				//사용자가 입력한 키보드 데이터! => e.getKeyCode()
				System.out.println(e.getKeyCode());
				
				//키보드 esc 누르면 사라지게 하는법
				if(e.getKeyCode()==27) {//27 = KeyEvent.VK_ESCAPE
					//setVisible(false);//숨김
					dispose();//창 소멸
					//System.exit(0);//시스템 종료
				}
			}
		};
		area.addKeyListener(k);
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame18() {
		this.place();
		this.event();
		this.setTitle("GUI 예제 18");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test18 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame18 frame = new MyFrame18();
	}
}
