package oop.static1;

public class Test01 {
	public static void main(String[] args) {

		Calculator a = new Calculator(10L,20L);
		long total = a.getTotal();
		System.out.println(total);
		
		Calculator b = new Calculator(20L,30L);
		System.out.println(b.getTotal());
		//=>문제점 : 간단한 작업을 매번 객체를 만들어 수행
		//=>해결책 : 객체를 만들지 않고도 계산
		// 	     : 하나의 객체로 계속 계산
		
		
	}
}
