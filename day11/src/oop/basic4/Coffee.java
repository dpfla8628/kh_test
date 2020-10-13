package oop.basic4;

public class Coffee {
	String name,type;
	int price;
	boolean event;
	
	void info(String a, String b, int c,boolean d){
		this.name=a;
		this.type=b;
		if(d==true) {
			this.price=c-500;
			}
		else {
			this.price=c;
			}
		this.event=d;
		}
	
	void print() {
		System.out.println("이름 \t: "+this.name);
		System.out.println("분류 \t: "+this.type);
		System.out.println("판매가격 \t: "+this.price);
		System.out.println("행사여부 \t: "+this.event);
		System.out.println("--------------------");
	}
}
