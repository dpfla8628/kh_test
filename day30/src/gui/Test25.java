package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame13 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	
	//모든 컴포넌트는 paint() 메소드를 그림을 그리게 되어있다.
	//내 마음대로 그림을 그리고 싶다면 paint() 메소드를 재정의 해야한다 = 익명중첩클래스
	//paint는 내부적으로 다음 상황에서 실행된다
	//1.최초 실행 시 자동호출 : 사용자에게 표시될 화면을 그리기 위해
	//2.크기 변경 시 자동호출 : 크기 변화로 인한 추가되거나 제거되는 부분을 표현하기 위해
	//3.내가 원하는 시점에 호출 : .repaint() 명령
	private JPanel root = new JPanel() {
		//ctrl+space누르면 재정의 가능~!~!~!~!~!~!
		@Override
		public void paint(Graphics g) {
			//System.out.println("그림 그리는 메소드 실행!");
		
			//root가 도화지, g가 펜의 역할을 수행
			g.drawLine(50, 50, 150, 150);//(50,50)에서 (150,150)까지
			g.drawLine(150, 50, 50, 150);
			
			g.setColor(Color.RED);
			g.drawLine(50, 150, 150, 150);
		
			//사각형
			g.drawRect(200, 50, 100, 100);
			g.fillRect(50, 200, 100, 100);
			
			//원 : oval, 사각형과 원은 그리기 위한 정도가 동일
			g.setColor(Color.black);
			g.drawOval(200, 50, 100, 100);
			g.fillOval(50, 200, 100, 100);
			
		}
	};
	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);
		
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
			
	}
		
	//생성자 : 창에 대한 설정
	public MyFrame13() {
		this.place();
		this.event();
		this.setTitle("GUI 예제 13");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test25 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame13 frame = new MyFrame13();
	}
}
