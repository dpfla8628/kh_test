package calender;

import java.util.Calendar;

public class Test01 {
	public static void main(String[] args) {
		//java.util.Calender 클래스
		//:추상 클래스
		//객체 생성 불가
		//별도의 생성 명령이 존재 
		
		//Calendar c =new Calendar();
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		//1. 설정 : .set(항목, 값)
		//2. 반환 : .get(항목) 
		//YEAR : 연도
		//MONTH : 월(Calendar에서 월은 0부터 11까지로 설정) 따라서 꺼낼 때 +1, 설정할 때 -1
		//DAY_OF_MONTH : 일
		//HOUR_OF_DAY : 시
		//MINUTE : 분
		//SECOND : 초
		
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH);
		System.out.println(month);
		
		int day = c.get(Calendar.DATE);//=DAY_OF_MONTH
		System.out.println(day);
		
		
		
		
	}

}
