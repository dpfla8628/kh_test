package oop.constructor1;

public class Test01 {
	public static void main(String[] args) {
		//학생 객체 생성
		//Student s1 = new Student(); -> 불가능
		Student  s1 = new Student("홍길동",80);
		Student  s2 = new Student("피카츄",90);
		
		s1.print();
		s2.print();
	}

}
