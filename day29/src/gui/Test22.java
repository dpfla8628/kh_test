package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame22 extends JFrame{
	
//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel();
	
	private JTextArea area = new JTextArea();
	private JScrollPane scroll = new JScrollPane(area);
	
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
	private JRadioButton red = new JRadioButton("빨강");
	private JRadioButton blue = new JRadioButton("파랑");
	private JRadioButton choice = new JRadioButton("사용자 정의");

//----------------------------------------------------------------
//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);	
	
		root.setLayout(new BorderLayout());
		root.add(scroll);
	}
//----------------------------------------------------------------	
//멤버 메소드 : 이벤트 설정
	public void event() {

//		MouseListener mou1 = new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				dispose();
//			}
//		};
//		exit.addMouseListener(mou1);

		//ActionListener사용 가능!! 이게 더 효율적
//종료
		exit.addActionListener (e->{
			System.exit(0);
		});
//새창열기
		newWindow.addActionListener(e ->{
			MyFrame22 frame = new MyFrame22();
		});
		
		
	//JFileChooser : 파일 선택창
//불러오기		
	//showOpenDialog() : 파일 열기창 
		open.addActionListener(e->{
			JFileChooser chooser = new JFileChooser();
			int choice = chooser.showOpenDialog(root);//int형이다
			
		//확인을 누를 때 choice는 0으로 반환된다 => 상수 : APPROVE_OPTION
			if(choice == JFileChooser.APPROVE_OPTION) {
				System.out.println("열어라!");
				//문자열 입력
				try {
					StringBuffer buffer = new StringBuffer();
					//불러올 파일 정보를 가져와라!!
					File target = chooser.getSelectedFile();
					FileReader fr = new FileReader(target);
					BufferedReader br = new BufferedReader(fr);
					while(true) {
						String line = br.readLine();
						if(line ==  null)break;
						buffer.append(line);
						buffer.append("\n");
						}
					br.close();
					
					//다 읽은 내용(buffer)을 area에 설정
					 area.setText(buffer.toString());
					
				 }catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			
		});
//저장하기
		//showSaveDialog() : 파일 저장창 / 저장하기
		save.addActionListener(e->{
			JFileChooser chooser = new JFileChooser();
			int choice = chooser.showSaveDialog(root);
			
			if(choice == JFileChooser.APPROVE_OPTION) {
				System.out.println("저장해라!");
				try {
				File target = chooser.getSelectedFile();//저장할 파일 정보를 가져와라!
				FileWriter fw = new FileWriter(target);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.print(area.getText());
				pw.close();
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
//색상
		red.addActionListener(e ->{
			area.setForeground(Color.red);
		});
		blue.addActionListener(e ->{
			area.setForeground(Color.blue);
		});
		
//색상 - 사용자 정의(JColorChooser)
		choice.addActionListener(e->{
			Color c = /*자료형 Color*/JColorChooser.showDialog(root, "골라골라", Color.black);
			
			if(c!=null) {//취소
				area.setForeground(c);
			}
		});
		
//------------------------------------------------------------		
			
	}
	//멤버 메소드 : 메뉴 설정
	public void menu() {//메뉴는 창 상단에 위치하기 때문에 Jframe(this)에 설정한다
		this.setJMenuBar(bar); //set은 한개만 추가
		bar.add(file);
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
		
		ButtonGroup group = new ButtonGroup();
		group.add(red);
		group.add(blue);
		group.add(choice);
		
//------------------------------------------------------------
//******단축키 지정
		//단축키를 누르면 해당하는 컴포넌트에 이벤트가 발생한다
		//									   (   키 code     ,상태값(보조키))
		//같은 esc여도 그냥 esc(0) , ctrl+esc등 다양하기 때문에 보조키를 설정해준다
		//만약 alt+esc라면?		(	,KeyEvent.ALT_DOWN_MASK) 
		//만약 alt+shift+esc?	(	,KeyEvent.ALT_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK)     
		KeyStroke esc = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0);
		exit.setAccelerator(esc);
	}
//------------------------------------------------------------		
	//생성자 : 창에 대한 설정
	public MyFrame22() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("GUI 예제 22");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		//this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Test22 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame22 frame = new MyFrame22();
	}
}