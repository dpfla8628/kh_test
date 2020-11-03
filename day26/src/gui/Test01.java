package gui;

import javax.swing.JFrame;

public class Test01 {
	public static void main(String[] args) {
		//창 생성
		JFrame frame = new JFrame();
		
		//창을 보이게 하는 명령
		frame.setVisible(true);
	
		frame.setTitle("자바 그래픽 예제");
		frame.setLocation(300,300);//좌측 상단의 위치(x,y) - px
		frame.setSize(400,400);//크기(폭,높이) -px(pixcel,화소)
		frame.setResizable(false);//창 크기 변경 불가
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);//x를 누르면 프로그램 종료
		
		
	}

}
