package oop.static2;

public class Calculator {
	
	//생성자를 만들지 않았지만, 기본 생성자 1개는 숨어있다
	//멤버 필드를 없애고 매개변수로 데이터를 즉시 받아온다
	public long plus(long a, long b) {
		return a+b;//일회성 매개변수 출력
	}
}
