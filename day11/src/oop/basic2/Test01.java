package oop.basic2;

public class Test01 {
	public static void main(String[] args) {
		//선수정보 3개(객체) 생성
		Record p1 = new Record();
		Record p2 = new Record();
		Record p3 = new Record();
		
		//정보 설정(초기화)
		//Record의 info 메소드에 매개변수를 넣어준다
		p1.info("김연아","피겨스케이팅",2,0,1);
		p2.info("이상화","스피드스케이팅",1,2,1);
		p3.info("윤성빈","스켈레톤",1,0,1);
		
		//출력
		//Record의 print 메소드 실행
		p1.print();
		p2.print();
		p3.print();
	}	
}
