package oop.modifier2;

public class Bank {
	//멤버 변수 (인스턴스 변수) - private로 잠금처리
	private String name;
	private int price,month;
	private float basic,plus;
	
	//멤버 메소드 (인스턴스 메소드) - this를 사용할 수 있음
	void setName(String name) {
		this.name=name;
	}
	void setBasic(float basic) {
		if(basic<=0) return;
		this.basic=basic;
	}
	void setPlus(float plus) {
		if(plus<0) return;
		this.plus=plus;
	}
	void setPrice(int price) {
		switch(price) {
		case 100 : case 200 : case 500 : case 1000:
			this.price=price;
		}
	}
	void setMonth(int month) {
		if(!(month%10==0))return;
		this.month=month;
	}
	
	void info(String name, float basic, float plus, int price, int month) {
		this.setName(name);
		this.setBasic(basic);
		this.setPlus(plus);
		this.setPrice(price);
		this.setMonth(month);
	}
	
	void print() {
		System.out.println("상품명 \t : "+this.name);
		System.out.println("기본이율 \t : "+this.basic+"%");
		System.out.println("우대이율 \t : "+this.plus+"%");
		System.out.println("월 납입액 \t : "+this.price+"만원");
		System.out.println("기간 \t : "+this.month+"개월");
		System.out.println("------------------");
	}
}
