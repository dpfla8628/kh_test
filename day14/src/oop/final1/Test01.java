package oop.final1;

public class Test01 {
	public static void main(String[] args) {
		//final 키워드 : 불변(마지막)
		
		//기본적으로 변수는 언제든지 변경(덮어쓰기)이 가능하다
		int a = 10;
		a=20;
		System.out.println(a);
		
		final double pi=3.14;
		//pi=1.5; 변경 불가능
		System.out.println(pi);
	}

}
