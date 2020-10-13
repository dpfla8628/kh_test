package oop.basic3;

public class Store {
	String code, name,type;
	int price;
	
	void info(String a, String b, String c,int d){
		this.code=a;
		this.name=b;
		this.type=c;
		this.price=d;
		}
	void print() {
		System.out.println("상품코드 \t:"+this.code);
		System.out.println("이름 \t:"+this.name);
		System.out.println("분류 \t:"+this.type);
		System.out.println("판매가격 \t:"+this.price);
		System.out.println("--------------------");
	}

}
