//java8 api 페이지 이용해보기

package api.lang.object;

import java.lang.*;

public class Test01 {
	public static void main(String[] args) {
		//남이 만든 object 클래스가 뭔지는 모르지만 객체를 만들어보자
		
		 Object a = new Object();
		 Object b = new Object();
		 
		 //hashcode():객체 일련번호만 숫자로 반환하는 명령
		 //객체를 구분하기 위한 번호로, 일련번호가 다르면 다른 객체로 판단
		 //=>a와b는 다른 객체이다
		 int v1 = a.hashCode();
		 int v2 = b.hashCode();
		 
		 System.out.println("v1="+v1);
		 System.out.println("v2="+v2);
		 
		 //문제 : a,b 각각 toString 기능을 사용하고 결과 출력
		 //toString 은 객체 요약정보를 반환하는 명령 = 형태@일련번호
		 String s1=a.toString();
		 String s2=b.toString();
		 
		 System.out.println("s1="+s1);
		 System.out.println("s2="+s2);
	}

}
