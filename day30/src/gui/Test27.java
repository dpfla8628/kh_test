package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


class MyFrame27 extends JFrame{
	
	//이미지 불러오기 : ToolKit 사용
	private Image image = Toolkit.getDefaultToolkit().getImage("Image/lion.png");
	
	//변화를 위해 변수 값 미리 지정
	private int x = 20;
	private int y = 20;
	private int width = 100;
	private int height=150;
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel() {
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());//전체 청소
			g.drawImage(image, x, y, width, height,this); //this==root
		}
	};
	
	private JMenuBar bar = new JMenuBar();
	private JMenu menu = new JMenu("메뉴");
	private JMenuItem small = new JMenuItem("작게");
	private JMenuItem big = new JMenuItem("크게");
	private JMenuItem up = new JMenuItem("위로");
	private JMenuItem down = new JMenuItem("아래로");
	private JMenuItem left = new JMenuItem("왼쪽으로");
	private JMenuItem right = new JMenuItem("오른쪽으로");
	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);	
	}
	//멤버 메소드 : 이벤트 설정
	public void event() {
		//사각형을 축소해라!!!
		//폭과 높이는 -20씩 변경하고 다시 그려라
		small.addActionListener(e -> {
			width-=20;
			height-=20;
			root.repaint();
		});	
		//크게
		big.addActionListener(e -> {
			width+=20;
			height+=20;
			root.repaint();
		});
		//위로
		up.addActionListener(e -> {
			y-=10;
			root.repaint();
		});
		//아래로
		down.addActionListener(e -> {
			y+=10;
			root.repaint();
		});
		//왼쪽으로
		left.addActionListener(e -> {
			x-=10;
			root.repaint();
		});
		//오른쪽으로
		right.addActionListener(e -> {
			x+=10;
			root.repaint();
		});
	}
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		this.setJMenuBar(bar);
		bar.add(menu);
		menu.add(small);
		menu.add(big);
		menu.add(up);
		menu.add(down);
		menu.add(left);
		menu.add(right);
		
		small.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1,0));
		big.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2,0));
	
	}
		
	//생성자 : 창에 대한 설정
	public MyFrame27() {
		this.place();
		this.event();
		this.menu();
		this.setTitle("GUI 예제 27");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test27 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame27 frame = new MyFrame27();
	}
}
