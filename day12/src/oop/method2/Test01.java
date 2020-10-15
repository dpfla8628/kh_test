package oop.method2;

public class Test01 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();
		
		p1.info("갤럭시", "SKT", -30000, 22);
		p2.info("아이폰", "KT", 170000, 24);
		p3.info("갤럭시폴드", "LG", 240000, 36);
		
		p1.print();
		p2.print();
		p3.print();
	}
}
