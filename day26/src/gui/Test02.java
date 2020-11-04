package gui;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//앞에서 배운 창에 버든과 같은 컴포넌트 배치

public class Test02 {
	public static void main(String[] args) {
//		라벨 : 글자를 작성할 수 있는 공간
//		버튼 : 누를 수 있는 도구(JButton)
//		입력창 : 값을 넣을 수 있는 도구
//		체크 박스 : 클릭을 통해 선택을 할 수 있는 도구
//		라디오 : 여러개 중에 선택을 할 수 있는 도구
		
		JFrame frame = new JFrame();
		//frame.setVisible(true);
		frame.setTitle("자바 그래픽 예제");
		frame.setLocation(300,300);//좌측 상단의 위치(x,y) - px
		frame.setSize(400,400);//크기(폭,높이) -px(pixcel,화소)
		frame.setResizable(false);//창 크기 변경 불가
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);//x를 누르면 프로그램 종료
		
		//컴포넌트가 많아지면 반드시 배치방법(LayoutManager)을 정해야 한다
		FlowLayout layout = new FlowLayout();//flow 형식의 자리배치 규칙
		//frame에 layout을 설정
		frame.setLayout(layout);
		
		JButton bt = new JButton("눌러봐!");
		JButton bt2 = new JButton("2번째버튼");
		
		//frame에 bt을 배치(아무런 설정이 없을 경우 덮어쓰기 처리)
		frame.add(bt);
		frame.add(bt2);
		
		//항상 준비가 끝나면 창을 보여줘야 한다
		frame.setVisible(true);
		
	}

}
