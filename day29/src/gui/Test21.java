package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame21 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel();
	
	//창 산단에 부착시키는 도구 모음
	private JMenuBar bar = new JMenuBar();
	
	private JMenu file = new JMenu("파일");
	private JMenu edit = new JMenu("편집");
	
	private JMenuItem newFile = new JMenuItem("새로 만들기");
	private JMenuItem newWindow = new JMenuItem("새창 열기");
	private JMenuItem save = new JMenuItem("저장하기");
	private JMenuItem open = new JMenuItem("불러오기");
	private JMenuItem exit = new JMenuItem("종료하기");
	
	private JMenu color = new JMenu("색상");
	private JMenuItem red = new JMenuItem("빨강");
	private JMenuItem blue = new JMenuItem("파랑");
	private JMenuItem choice = new JMenuItem("사용자 정의");
	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);	
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
			
	}
	//멤버 메소드 : 메뉴 설정
	public void menu() {//메뉴는 창 상단에 위치하기 때문에 Jframe(this)에 설정한다
		this.setJMenuBar(bar); //set은 한개만 추가
		bar.add(file);			//add는 여러번 추가
		bar.add(edit);
		file.add(newFile);
		file.add(newWindow);
		file.add(save);
		file.add(open);
		file.add(exit);
		
		edit.add(color);
		color.add(red);
		color.add(blue);
		color.add(choice);
	}
		
	//생성자 : 창에 대한 설정
	public MyFrame21() {
		this.place();
		this.event();
		this.menu();
		this.setTitle("GUI 예제 21");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test21 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame21 frame = new MyFrame21();
	}
}