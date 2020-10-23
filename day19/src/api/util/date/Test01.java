package api.util.date;

import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		//java.util.Data 클래스
		//생성자중에 비추천(Deprecated)가 많다
		//이유는 Y2K( 컴퓨터가 2000년 이후의 연도를 제대로 인식하지 못하는 결함)
		
		//기본 생성자를 이용하면 "현재시간"을 가져온다
		Date a = new Date();
		System.out.println(a);
		
		//연월일을 설정하는 생성자(비추천)
		//비추천은 경과와 함께 표식이 나온다
		//여러가지 문제점으로 인해 앞으로 스지 말것을 권장(사라질 수도 있다는 표시)
		Date b = new Date(2020,10,23);
		System.out.println(b);
		
		
	}

}
