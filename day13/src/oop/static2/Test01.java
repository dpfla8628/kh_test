package oop.static2;

public class Test01 {
	public static void main(String[] args) {
		Calculator a = new Calculator();//객체
		long total = a.plus(10L, 20L);
		System.out.println(total);
		System.out.println(a.plus(20L, 30L));
	}

}
