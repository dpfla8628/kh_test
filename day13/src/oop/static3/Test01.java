package oop.static3;

public class Test01 {
	public static void main(String[] args) {
		//정적 메소드(static)는 객체 없이 사용 가능
		long total = Calculator.plus(10L, 20L);
		System.out.println("합계 ="+total);
		
		
	}
	
	
}
