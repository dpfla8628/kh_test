package oop.method1;

public class Test02 {
	public static void main(String[] args) {
		Student a = new Student();
		
		//a.name="홍길동"보다 나은 방법
		a.setName("홍길동");
		a.setScore(80);
		
		a.print();
	}

}
