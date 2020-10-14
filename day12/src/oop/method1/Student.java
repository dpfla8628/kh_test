package oop.method1;

public class Student {
	//*멤버 변수( 인스턴스 변수 )
	//=> 객체의 정보를 저장
	String name;
	int score;
	
	//*맴버 메소드( 인스턴스 메소드 )
	//=> 객체의 코드(기능)를 저장
	void info(String name, int score) {
		this.name=name;
		if(score>=0 && score<=100) {
			this.score=score;
		}
	}
	
	//초기화 메소드를 변수 하나당 한개씩 생성 = Setter메소드
	void setName(String name) {
		this.name=name;
	}
	void setScore(int score) {
		if(score>=0 && score<=100) {
			this.score=score;
		}
	}
	
	
	void print() {
		System.out.println("이름 : "+this.name);
		System.out.println("점수 : "+this.score);
		
	
	}

}
