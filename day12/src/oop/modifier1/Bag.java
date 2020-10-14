package oop.modifier1;

public class Bag {
	//멤버변수 , 인스턴스 변수 : 객체의 정보를 저장하기 위한 변수
	private String name;
	private int price;
	
	//멤버메소드, 인스턴스메소드 : 객체의 기능을 구현하기 위한 영역
	//setter메소드 : 변수 개수만큼 (for 필터링)
	//조건 설정 가능!!
	void setName(String name) {
		this.name=name;
	}
	void setPrice(int price) {
		if(price<0) return;
		this.price=price;	
	}
	
	void info(String name, int price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	void print() {
		System.out.println("가방 이름 : "+this.name);
	}
	

}
