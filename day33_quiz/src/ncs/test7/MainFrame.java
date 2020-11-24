//클래스						메소드
//ScoreFrame 				+ScoreFrame()
//ScoreFrame$ActionHandler	+actionPerformed(event:ActionEvent)
//MainFrame					+main(args:String[]):void



package ncs.test7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//나만의 창 클래스 템플릿(기본폼)
class ScoreFrame extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	private JPanel root = new JPanel(new GridLayout(4,1));
	
	private JLabel label = new JLabel("점수를 입력하세요",JLabel.CENTER);
	
	private JPanel a = new JPanel(new GridLayout(1,4));
	private JPanel b = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JPanel c = new JPanel(new GridLayout(1,4));
	
	private JLabel javaL = new JLabel("자바 : ");
	private JTextField javaScore = new JTextField();
	private JLabel sqlL = new JLabel("      SQL : ");
	private JTextField sqlScore = new JTextField();
	
	private JButton calcBtn = new JButton("계산하기");
	
	private JLabel totalL = new JLabel("총점 : ");
	private JTextField total = new JTextField();
	private JLabel avgL = new JLabel("      평균 : ");
	private JTextField average = new JTextField();
	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setContentPane(root);
		
		root.add(label);
		label.setFont(new Font("돋움체",Font.BOLD,40));
	
		root.add(a);
		a.add(javaL);
		a.add(javaScore);
		a.add(sqlL);
		a.add(sqlScore);

		root.add(b);
		b.add(calcBtn);
		
		root.add(c);
		c.add(totalL);
		c.add(total);
		c.add(avgL);
		c.add(average);

		
	}
	//멤버 메소드 : 이벤트 설정
	public void ScoreFrame$ActionHandler() {
		calcBtn.addActionListener(e->{
			String a = javaScore.getText();
			String b = sqlScore.getText();
			total.setText(String.valueOf((Integer.parseInt(a))+(Integer.parseInt(b))));
			String c = total.getText();
			average.setText(String.valueOf((Integer.parseInt(c)/2)));
			
		 });
	}
		
	//생성자 : 창에 대한 설정
	public ScoreFrame() {
		this.place();
		this.ScoreFrame$ActionHandler();
		this.setTitle("GUI 예제 01");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class MainFrame {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		ScoreFrame frame = new ScoreFrame();
	}
}