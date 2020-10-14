package oop.method1;

public class Test01 {
	public static void main(String[] args) {
		
		Student a = new Student();
		
		a.info("홍길동", 90);
		a.print();
		
	//--------a 객체에서 이름만 변경
		
		a.name="이소룡";
		//a.info("이소룡", 90);
		a.print();
		
	//--------a 객체에서 점수만 변경
		
		//1. 다렉으로 넣음 : 조건문 거치지 않고 바로 출력
		//a.score=-80;		
		
		//2. info를 거치고 들어옴 => 조건을 넣어줄 수 있다 : 필터링되어서 결과 값이 제대로 나오지 않음
		a.info("이소룡",-80); 
		
		a.print();
	}

}
