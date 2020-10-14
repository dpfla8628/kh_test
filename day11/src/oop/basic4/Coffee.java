package oop.basic4;

public class Coffee {
	//인스턴스변수, 멤버변수 : 객체가 사라지기 전까지 존재
	String name,type;
	int price;
	boolean event;
	
	void info(String a, String b, int c,boolean d){
		this.name=a;
		this.type=b;
		this.price=c;
		this.event=d;
		}
	
	void print() {
		System.out.println("이름 \t: "+this.name);
		System.out.println("분류 \t: "+this.type);
		System.out.println("판매가격 \t: "+this.price);
		//System.out.println("행사여부 \t: "+this.event);
		if(this.event) {//this.event==true
			System.out.println("*할인 가격\t: "+(this.price-500));
		}
		System.out.println("--------------------");
	}
}
