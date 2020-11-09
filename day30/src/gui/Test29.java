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


class Lion{
	//이미지 불러오기 : ToolKit 사용
	private Image image = Toolkit.getDefaultToolkit().getImage("Image/lion.png");
	//변화를 위해 변수 값 미리 지정
	private int x=-1 , y=-1;
	private int width = 100;
	private int height=150;
	
	//클래스형태 만들어주자
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	
}

class MyFrame29 extends JFrame{
	
	//여러개의 이미지를 가져오고 싶기 때문에 객체로 묶어서 생성해준다
//	private Lion a = new Lion();
//	private Lion b = new Lion();
//	private Lion c = new Lion();
	//=>리스트로 묶어주자
	private List<Lion> lion_list = new ArrayList<>();
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel() {
		@Override
		public void paint(Graphics g) {
			
			g.clearRect(0, 0, getWidth(), getHeight());
			
			for(Lion a : lion_list) {
				g.drawImage(a.getImage(), 
						a.getX()-a.getWidth()/2, a.getY()-a.getHeight()/2, 
						a.getWidth(), a.getHeight(), this);
			}
			
		}
	};

	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);	
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
		root.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			
			//Lion을 만들어서 위치를 정하고 저장소에 추가한 뒤에 repaint
			Lion lion = new Lion();
			lion.setX(e.getX());
			lion.setY(e.getY());
			lion_list.add(lion);
			root.repaint();
		}
		
		});

	}
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
		
	//생성자 : 창에 대한 설정
	public MyFrame29() {
		this.place();
		this.event();
		this.menu();
		this.setTitle("GUI 예제 29");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test29 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame29 frame = new MyFrame29();
	}
}
