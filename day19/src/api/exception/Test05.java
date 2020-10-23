package api.exception;

//try-catch는 호출자(caller)쪽에 적는게 좋다!

//나누기 기능은 오류가 발생할 가능성이 있다
//=>불완전한 메소드

public class Test05 {
	public static void main(String[] args) {
		try {
			int n = Calculator.div(10, 0);
			System.out.println("n= "+n);
		}
		catch(Exception e) {
			System.out.println("오류 발생!");
		}
	}

}
