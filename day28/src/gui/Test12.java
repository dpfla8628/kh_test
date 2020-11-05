package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

class MyFrame12 extends JFrame{
	//------------------------------------------------------------------	
	//멤버 변수	
		//모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	
		private JPanel root = new JPanel();
	
		//제목
		private JLabel top1 = new JLabel("설문조사",JLabel.CENTER);
		private JLabel top2 = new JLabel("내가 가장 좋아하는 자바 분야는?",JLabel.LEFT);
		
		//가운데 체크박스
		private JCheckBox r1 = new JCheckBox("상속");
		private JCheckBox r2 = new JCheckBox("다형성");
		private JCheckBox r3 = new JCheckBox("파일 입출력");
		
		//아래
		private JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		private JButton bt = new JButton("제출");
		
		
	//------------------------------------------------------------------	
	//멤버 메소드	
		//javax.swing.border
		//목표 : LineBorder을 만들어서 프레임(this)에 설정 -> 불가능
		//						JPanel(ContentPane:가장 큰 투명창)에 설정하자!
		public void place() {
		//this를 쓰지말고 root을 Frame의  ContentPane으로 설정!
			this.setContentPane(root);
			
		//this->root변경
			//this.setLayout(new GridLayout(6,1));수정
			root.setLayout(new GridLayout(6,1));
			
/********/	//Border border = new LineBorder(Color.red);
			//Border border = new LineBorder(Color.red,10);//테두리 두께 10
			//Border line = new LineBorder(Color.red, 10, true);//모서리가 둥글게
			//Border border = new TitledBorder("설문지");//보더 타이틀 제목
			//Border empty = new EmptyBorder(10,10,10,10);//투명판 테두리
			//Border border = new CompoundBorder(empty,line);//두개를 섞어서 사용한다(바깥테두리,안쪽테두리)
			
			//=>계속 import하는게(new) 싫다
			//BorderFactory를 사용해서 자동완성을 통해 편리하게 가져오자!
			//: 팩토리 패턴
			Border line = BorderFactory.createLineBorder(Color.red,10,false);
			Border empty = BorderFactory.createEmptyBorder(10,10,10,10);
			Border border = BorderFactory.createCompoundBorder(empty,line);
			
			root.setBorder(border);
			
			
		//제목1
			root.add(top1);
			top1.setFont(new Font("돋움체",Font.BOLD,20));
		//제목2
			root.add(top2);
			top2.setFont(new Font("돋움체",0,15));
			
		//가운데
		//세가지 체크중에서 한개만 선택하도록 묶고싶다
		//그룹도구(ButtonGroup) 사용
			ButtonGroup group = new ButtonGroup();
			group.add(r1);
			group.add(r2);
			group.add(r3);
		//r1을 체크되어있도록 설정
			r1.setSelected(true);
			root.add(r1);
			root.add(r2);
			root.add(r3);
			
		//아래
			root.add(bottom,BorderLayout.SOUTH);
			bottom.add(bt);
			
		}	
	//--------------------------------------------------------------------	
	//생성자 : 창에 대한 설정
		public MyFrame12() {
			this.place();
			this.setTitle("GUI예제10");
			this.setLocation(300,100);
			this.setSize(400,200);
			this.setResizable(false);
			this.setVisible(true);
		}
		
	}

	public class Test12 {
		public static void main(String[] args) {
			MyFrame12 f = new MyFrame12();		
		}
	}
