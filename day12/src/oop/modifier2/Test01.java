package oop.modifier2;

public class Test01 {
	public static void main(String[] args) {
	
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		Bank b3 = new Bank();

		b1.info("생애 최초 주택마련 적금", 2.3f, 0.5f, 100, 100);
		b2.info("내 꿈은 사장님 적금", 2.0f, 0.7f, 200, 20);
		b3.info("생애 최초 주택마련 적금", 2.1f, 1.1f, 500, 10);
		
		b1.print();
		b2.print();
		b3.print();
		
	}
}
