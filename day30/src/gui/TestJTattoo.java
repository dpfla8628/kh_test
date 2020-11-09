package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame25 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel();
	
	JButton bt = new JButton("버튼");
	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);
		
		root.add(bt);
		
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
			
	}
		
	//생성자 : 창에 대한 설정
	public MyFrame25() {
		this.place();
		this.event();
		this.setTitle("GUI 예제 25");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class TestJTattoo {
	public static void main(String[] args) {
		//창 생성 전에 스킨을 적용시키는 설정을 수행해야한다
		//스킨을 LookAndFeel
		//자체적으로 제공되는 LookAndFeel도 있고 외부에서 제공하는 것도 있다(JTattoo)
		//UIManager.setLookAndFeel("적용시킬 클래스명");
		//예외전가하면 아예 실행이 안되니가 try-catch를하자
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");//스킨적용
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame25 frame = new MyFrame25();
		
		
		
	}
}
