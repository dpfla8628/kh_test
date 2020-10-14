package opp.method2;

public class Phone {
	String name, tele;
	int price, month;
	
	//하나씩 설정
	void setName(String name) {
		this.name=name;
	}
	void setTele(String tele) {
		this.tele=tele;
	}
	void setPrice(int price) {
		if(price<0) {
			return;//음수면 리턴시킨다.
			}
		this.price=price;
	}
	void setMonth(int month) {
		switch(month) {
		case 24 : case 30: case 36:
			this.month=month;
		}
	}
	//위의 방법은 비효율 적이기때문에 편하게 불러오기 위해 아래처럼 새로운 매소드 생성
	void info(String name, String tele, int price, int month) {
		//조건을 실행시키기 위해서 & 따로 하나씩 불러오기 위해서
		//this.name=name로 쓰지 말고 아래처럼 사용하자
		this.setName(name);
		this.setTele(tele);
		this.setPrice(price);
		this.setMonth(month);
	}
	

	void print() {
		System.out.println("이름 \t : "+this.name);
		System.out.println("통신사 \t : "+this.tele);
		//if(price>=0) {
			System.out.println("가격 \t : "+this.price+"만원");
		//}
		//else {
		//	System.out.println("음수 입력 불가능");
		//}
		//if(month==24||month==30||month==36) {
			System.out.println("약정개월수 \t : "+this.month+"개월");
		//}
		//else {
		//	System.out.println("24,30,36개월로만 설정 가능");
		//}
		System.out.println("-------------------");
	}

}
