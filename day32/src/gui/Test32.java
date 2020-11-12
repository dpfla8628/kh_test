

//내가 만든 카드 뒤집기

package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame32 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();
	
	//아이콘(Icon) : 이미지의 종류이긴 하지만 컴포넌트에 집어넣는 형태로 특화된 이미지
	// - 크기변경이 불가능하며 바꾸고 싶다면 Image로 변환하여 조정한 뒤 다시 되돌려야 한다
	private ImageIcon icon1 = new ImageIcon("image/icon1.png");
	private ImageIcon icon2 = new ImageIcon("image/icon2.png");
	
	private JPanel button = new JPanel(new GridLayout(2,2));
	private JButton[] bt = new JButton[4];
	
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		
		root.setLayout(new BorderLayout());
		root.add(button);
		
		List<Integer> lists = new ArrayList<Integer>();
		for(int i=0; i<2;i++) {
			lists.add(0);
			lists.add(1);
		}
		Collections.shuffle(lists);
	
		for(int i=0; i<bt.length; i++) {
			bt[i]=new JButton();
			if(lists.get(i)==0) {
				bt[i].setText(String.valueOf(lists.get(i)));
				button.add(bt[i]);}
			else {
				bt[i].setText(String.valueOf(lists.get(i)));
				button.add(bt[i]);
			}
		}
	}
	
	//멤버 메소드 : 이벤트 설정
	public void event() {
		//목표 : 버튼을 누르면 아이콘이 나타났다 사라졌다 하도록 구현
		
		bt[0].addActionListener(e->{	
				if(bt[0].getIcon()==null) {
						if(bt[0].getText()=="0") {
							bt[0].setIcon(icon1);
						}
						else {
							bt[0].setIcon(icon2);
						}
					}
					else {
						bt[0].setIcon(null);
						}
		});
		bt[1].addActionListener(e->{	
			if(bt[1].getIcon()==null) {
					if(bt[1].getText()=="0") {
						bt[1].setIcon(icon1);
					}
					else {
						bt[1].setIcon(icon2);
					}
				}
				else {
					bt[1].setIcon(null);
					}
	});
		bt[2].addActionListener(e->{	
			if(bt[2].getIcon()==null) {
					if(bt[2].getText()=="0") {
						bt[2].setIcon(icon1);
					}
					else {
						bt[2].setIcon(icon2);
					}
				}
				else {
					bt[2].setIcon(null);
					}
	});
		bt[3].addActionListener(e->{	
			if(bt[3].getIcon()==null) {
					if(bt[3].getText()=="0") {
						bt[3].setIcon(icon1);
					}
					else {
						bt[3].setIcon(icon2);
					}
				}
				else {
					bt[3].setIcon(null);
					}
	});
		
	}
	
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame32() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("GUI 예제 32");
		this.setLocation(100, 100);
		this.setSize(400, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);
	}
}

public class Test32 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame32 frame = new MyFrame32();
	}
}