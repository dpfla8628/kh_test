package oop.inherit3;

//뽀로로와 타요 인형의 공통점
//상위클래스, 슈퍼클래스, 부모클래스, 추상클래스

//변수 접근 제한 : 1.private, 2.protected, 3.public
//			  1.나만 이용 가능 2.자식 클래스 이용 가능 3.외부에서 접근 가능

//메소드 재정의 고려(오버라이드, 오버로드)
//오버로드(생성자) : 선택지가 두개
//오버라이드(상속) : 덮어쓰기

public class Doll {
	protected String name;
	protected int price;
	
	public void hello() {
		System.out.println("안녕!");
	}

}
