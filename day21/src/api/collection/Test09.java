package api.collection;

public class Test09 {
	public static void main(String[] args) {
		//인터페이스는 객체를 생성할 수 없습니다.
		//=인터페이스를 이용해서 "함수형 객체"를 생성할 수 있다.
		//=익명 중첩 클래스
		//=1회용 상속을 간편하게 받기 위한 구문
		
		
		//Car a = new Car(); 불가능
		Car a = new Car() {
			@Override//재정의
			public void drive() {
				System.out.println("부릉부릉");
			}
		};
		a.drive();
	
		//추론(Lambda) : 바보가 아닌이상 추리할 수 있는 내용이라면 다 적지 않아도 완성시켜 주겠다
		//- Car에는 메소드가 1개밖에 없다 => 무조건 drive
		//- 인터페이스를 객체로 만드려면 반드시 익명 중첩 클래스를 써야한다
		// => 인터페이스가 메소드가 1개밖에 없으면 람다 사용 가능
		Car c = ()->{
			System.out.println("붕붕");
		};
		c.drive();
	
	}
}
