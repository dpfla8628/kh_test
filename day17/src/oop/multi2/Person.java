package oop.multi2;

//의사이면서 가수인 사람 클래스
//인터페이스는 implements라는 별도의 키워드로 상속 받아야한다.
//여러개 상속 받을 때는 콤마를 사용하여 구분
//클래스는 상속 가능
//이 코드에서 super는 상속 받은 class를 지칭한다! 인터페이스는 불가능!!
public class Person extends Female implements Singer,Doctor{

	@Override
	public void sing() {
		System.out.println("노래");
		
	}

	@Override
	public void dance() {
		System.out.println("춤");
		
	}

	@Override
	public void observe() {
		System.out.println("진료");
		
	}
	

}
