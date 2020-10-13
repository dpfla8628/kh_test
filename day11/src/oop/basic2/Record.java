package oop.basic2;

public class Record {

	String name,type;
	int gold,silver,bronze;
	
	//메모장처럼 코드에 이름을 붙여 저장할 수 있는 영역
	//=메소드(method)
	void print() {
		//메소드에서는 this는 자기 자신을 의미
		System.out.println("이름 : "+this.name);
		System.out.println("종목 : "+this.type);
		System.out.println("금메달 : "+this.gold+"개");
		System.out.println("은메달 : "+this.silver+"개");
		System.out.println("동메달 : "+this.bronze+"개");		
	}
	//정보 설정(초기화) 코드를 저장할 메소드 생성
	//그때 그때 다른 값으로 초기화 되어야 함
	//해결 => "외부" 데이터(매개변수)를 전달 받아야 함
	void info(String a,String b,int c, int d, int e) {
		this.name = a;
		this.type = b;
		this.gold = c;
		this.silver = d;
		this.bronze = e;
	}
}
