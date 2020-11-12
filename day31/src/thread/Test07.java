package thread;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame07 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel();
	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);
		
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
			
	}
	//멤버 메소드 : 제목
	public void title() {
		//한국 스타일의 시간을 출력
		//Date, SimpleDateFormat
		
		Thread t = new Thread() {
			
			public void run() {
				
				while(true) {
					Date d = new Date();
					Format f = new SimpleDateFormat("y년 M월 d일 a h시 m분 s초");
					//this.setTitle(f.format(d)); (x)여기서 this는 frame이 아닌 thread를 가르키기 때문에 에러
					setTitle(f.format(d));
					//this가 모소하므로 생략하거나 명시적으로 바깥에 this임을 선언한다
					// => MyFrame07.this.setTitle(f.format(d));
					
					try {
						Thread.sleep(1000L);
					}
					catch(Exception e) {}
				}
			}
		};
		t.setDaemon(true);
		t.start();
	}
		
	//생성자 : 창에 대한 설정
	public MyFrame07() {
		this.place();
		this.event();
		this.title();
		this.setLocation(100, 100);
		this.setSize(600, 400);
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test07 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame07 frame = new MyFrame07();
	}
}
