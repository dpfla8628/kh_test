
//계산기

package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame24 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();

	//표시 영역
	private JLabel lcd = new JLabel("0", JLabel.RIGHT);
	
	//버튼 16개 생성(배열로 처리)
	private JPanel panel = new JPanel(new GridLayout(4, 4));
	private JButton[] btn = new JButton[16];//생성은 나중에
	
	//제목이 문제 : 규칙이 없으므로 미리 제목만 준비해둔다
	private String[] title = new String[] {
		"7","8","9","+","4","5","6","*","1","2","3","/","0","C","-","="
	};
	
	//화면에 들어갈 내용은 아니지만 계산을 하려면 숫자 한개랑 연산자는 기억을 하고 있어야 한다.
	// A + B = ? 일 때, 화면에는 B만 적혀있으니 A와 +를 알고 있어야 한다.
	private int memory;
	private String operator;
	
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		
		root.setLayout(new BorderLayout());
		root.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		root.add(lcd, BorderLayout.NORTH);
		lcd.setPreferredSize(new Dimension(300, 80));
		lcd.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		Font font = new Font("굴림", Font.PLAIN, 30);
		lcd.setFont(font);
		
		root.add(panel);
		panel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
		
		for(int i=0; i < btn.length; i++) {
			btn[i] = new JButton(title[i]);
			btn[i].setFont(font);
			panel.add(btn[i]);
		}
		
	}
	
	//멤버 메소드 : 이벤트 설정
	public void event() {
		//버튼이 16개나 되니까 하나씩 설정하기가 어렵다. 모아서 처리한다
		//- 모아서 처리하면 무슨 버튼을 눌렀는지 알 수가 없다
		//- 확인하는 방법은 2가지가 있다.
		//	- e.getSource() : 이벤트 발생 컴포넌트를 알 수 있다.(Object)
		//	- e.getActionCommand() : 이벤트 발생 컴포넌트에 표시된 글자를 알 수 있다.(String)
		ActionListener listener = e->{
			String text = e.getActionCommand();
			switch(text) {
			//숫자를 입력했으면 화면에 추가한다. 단, 앞이 0이면 안되니까 숫자로 바꿨다가 추가한다.
			case "1":	case "2":	case "3":	case "4":	case "5":
			case "6":	case "7":	case "8":	case "9":	case "0":
				int n = Integer.parseInt(lcd.getText() + text);
				lcd.setText(String.valueOf(n));
				break;
			//계산기호를 입력하면 입력된 숫자를 memory에 저장하고, 연산자도 operator에 저장한다.
			//입력된 값을 초기화한다.
			case "+":	case "*":	case "/":	case "-":
				memory = Integer.parseInt(lcd.getText());
				operator = text;
				lcd.setText("0");
				break;
			//C를 누르면 라벨의 글자를 지운다.
			case "C":
				lcd.setText("0");
				break;
			//=을 누르면 다음 계산을 수행한다.
			//<memory> <operator> <lcd.getText> = ?
			case "=":
				int result = 0;
				switch(operator) {
				case "+": result = memory + Integer.parseInt(lcd.getText()); break;
				case "-": result = memory - Integer.parseInt(lcd.getText()); break;
				case "*": result = memory * Integer.parseInt(lcd.getText()); break;
				case "/": result = memory / Integer.parseInt(lcd.getText()); break;
				}
				lcd.setText(String.valueOf(result));
				memory = 0;//메모리 제거
				operator = null;//연산자 제거
				break;
			}
		};	
		
		for(int i=0; i<btn.length; i++) {
			btn[i].addActionListener(listener);
		}
	}
	
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame24() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("계산기 문제");
		this.setLocationByPlatform(true);//운영체제가 위치를 결정하도록 설정
		this.setSize(300, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}

public class Test24 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		//main에 더이상 모든 코드를 적지 않겠다
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		MyFrame24 frame = new MyFrame24();
	}
}