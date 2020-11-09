package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;


class MyFrame28 extends JFrame{
	
	//이미지 불러오기 : ToolKit 사용
	private Image image = Toolkit.getDefaultToolkit().getImage("Image/lion.png");
	
	//변화를 위해 변수 값 미리 지정
	private int x=-1 , y=-1;
	private int width = 100;
	private int height=150;
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel() {
		@Override
		public void paint(Graphics g) {
			if(x!=-1 && y!=-1) {
				g.clearRect(0, 0, getWidth(), getHeight());//전체 청소
				g.drawImage(image, x-width/2, y-height/2, width, height,this); //this==root
			}
		}
	};

	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);	
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
		//클릭시
//		MouseListener m = new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//				x=e.getX();
//				y=e.getY();
//				root.repaint();
//			}
//		};
//		root.addMouseListener(m);

		//마우스 움직일때
		root.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				x=e.getX();
				y=e.getY();
				root.repaint();	
			}
		});

	}
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
		
	//생성자 : 창에 대한 설정
	public MyFrame28() {
		this.place();
		this.event();
		this.menu();
		this.setTitle("GUI 예제 28");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test28 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame28 frame = new MyFrame28();
	}
}
