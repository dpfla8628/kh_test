package oop.basic1;

public class Test01 {
	public static void main(String[] args) {
		//메세지(객체)1개 생성
		//(객체 = 복합 데이터)
		//new : 신규 주문 제작(동적 할당 연산자)
		Message a = new Message();
	
		a.sender="초롱초롱 라이언";
		a.text="응";
		a.time="오후 12:29";
		a.read=0;
		
		System.out.println(a);//(리모컨)->의미 없음
		System.out.println(a.sender);
		System.out.println(a.text);
		System.out.println(a.time);
		System.out.println(a.read);
	}
}
