package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;


class MyFrame30 extends JFrame{
	
	//이미지 불러오기 : ToolKit 사용
	private Image image = Toolkit.getDefaultToolkit().getImage("Image/lion.png");
	//변화를 위해 변수 값 미리 지정
	private int x=30 , y=30;
	private int width = 100;
	private int height=150;

	//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel() {
		@Override
		public void paint(Graphics g) {
			
			g.clearRect(0, 0, getWidth(), getHeight());
			g.drawImage(image, x, y, width, height, this);
			
		}
	};

	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);	
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
		//root에 마우스를 클릭하면 그림이 움직이게 처리해본다
		//움직이는 속도가 포인트! - 1px , 24프레임
		
		root.addMouseListener(new MouseAdapter() {
			@Override
			//x가 250px이 될때까지 이동(위에서는 30으로 지정해줬음)
			public void mouseClicked(MouseEvent e) {
			//혼자 다 하려니까 원하는 결과값이 안나온다 
				//이럴 때 Thread() ~ .start()를 써준다!
				new Thread(()->{
					for(int i=x; i<=250; i++) {
						x=i;
						root.repaint();
					
						//1000분의 24초만큼 휴식(60fps)
						try {
							Thread.sleep(1000/60);
						} catch (InterruptedException e1) {
					}
				}
			}).start();//****
		}
	});
}
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
		
	//생성자 : 창에 대한 설정
	public MyFrame30() {
		this.place();
		this.event();
		this.menu();
		this.setTitle("GUI 예제 30");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test30 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame30 frame = new MyFrame30();
	}
}
