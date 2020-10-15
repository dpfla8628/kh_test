package oop.constructor2;

public class Computer {
	//맴버 변수
	private String name;
	private int price;
	
	//생성자 : 객체를 생성하는 방법을 정하는 구문
	/*=객체를 만들 때 반드시 있어야 하는 것이 무엇일까?
	 * 1.이름 x 가격 x
	 * 2.이름 o 가격x	(o)
	 * 3.이름x 가격o
	 * 4.이름o 가격o 	(o)
	 */
	public Computer(String name) {//2
		this.setName(name);
		//this.price=0;보다 아래가 선호된다
		//setName에서 한번에 처리하는게 좋음
		this.setPrice(0);
	}
	public Computer(String name, int price) {//4
		this.setPrice(price);
		//this.price=price;=
		this.setPrice(price);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		if(price<0) return;
		this.price=price;
	}
	

}
