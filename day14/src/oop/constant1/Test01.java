package oop.constant1;

import java.util.Random;

public class Test01 {
	/*따로 클래스를 만들어 거기에 넣어서 불러올 수도 있다!!!
	//가위바위보 상수 생성 => 가독성 증가
	//public : 공개해서 아무나 접근 가능
	//static : 객체를 만들지 않고 편하게 사용
	//final  : 불변값으로 사용
	//클래스 안에, 메인 밖에 생성!!!
	public static final int 가위=1;
	public static final int 바위=2;
	public static final int 보=3;
	*/
	public static void main(String[] args) {
		//컴퓨터가 가위바위보를 랜덤으로 내도록 프로그래밍
		//가위(1),바위(2),보(3) : 1부터 3개를 출력해라!!
		//랜덤(Random)
		
		//도구 생성(ctrl+shift+o)->import
		Random r = new Random();
		
		int com=r.nextInt(3/*개수*/)+1/*부터*/;
		//스캐너랑 비슷하지만 스캐너를 입력받는것, 랜덤은 랜덤 생성하는 것
		System.out.println(com);
		
		switch(com) {
		case RSP.가위 : System.out.println("가위"); break;
		case RSP.바위 :System.out.println("바위");break;
		case RSP.보 :System.out.println("보");break; 
		}
		
	}

}
