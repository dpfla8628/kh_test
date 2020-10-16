package oop.inherit3;

//뽀로로와 타요 인형의 공통점
//상위클래스, 슈퍼클래스, 부모클래스, 추상클래스

//*변수 접근 제한 고려 : 1.private, 2.protected, 3.public
//  			  1.나만 이용 가능 2.자식 클래스 이용 가능 3.외부에서 접근 가능

//*메소드 재정의 고려(오버라이드, 오버로드)
//-오버로드(생성자) : 선택지가 두개
//-오버라이드(상속) : 덮어쓰기

//*생성자 : 필수 데이터를 초기화하는 역할

public class Doll {
	protected String name;
	protected int price;
	
	//메소드 : 기능은 동일한데 내용이 다른 경우 존재!(오버라이드)
	//앞에 final을 붙이면 재정의 불가!
	public void hello() {
		System.out.println("안녕!");
	}
	
	//생성자를 만들면 이 데이터는 반드시 설정해야 한다는 뜻
	//public Doll() => 필수요소 없다는 의미
	public Doll(String name) {
		this.name=name;
	}

}
