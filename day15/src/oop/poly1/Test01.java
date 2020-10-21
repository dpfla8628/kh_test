package oop.poly1;

public class Test01{
	public static void main(String[] args) {
		
		//*동적 생성 방식
		//Phone a = new ZFlip();
		//Phone b = new V60();
		//Phone c = new ZFlip();
		
		//:1.상속 2.재정의(Override)가 되어있으면 Phone의 call이
		//자동으로 IPhone의 call을 가르킨다 =>다형성 가능!! 업캐스팅! 

		//다양하게 비슷한 것들끼리(다형성)묶어서 상위 개념에 포함시키는 것 :업캐스팅
		//<->다운캐스팅
		
		//지금까지의 인스턴스 생성 코드는 좌우측 형태가 동일하다
		//*정적 생성 방식
		IPhone a = new IPhone();
		a.call();
		a.sms();
		a.camera();
	
		V60 b = new V60();
		b.call();
		b.sms();
		b.camera();
	
		ZFlip c = new ZFlip();
		c.call();
		c.sms();
		c.camera();
		}

}
