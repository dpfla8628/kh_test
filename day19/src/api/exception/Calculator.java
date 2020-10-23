package api.exception;

//클래스가 나눠져 있으면 try-catch는 어디에 쓸까?

public class Calculator {
//나누기 계산기
	
	//불완전한 메소드니까 try-catch를 꼭 쓰게하고 싶다면??
	//호출자에 강제로 쓸 수 있도록 여기서 throws Exception을 적어주자
	// : 예외 전가(예외 몰아주기) : throws
	public static int div(int a , int b) throws Exception{
		return a/b;
		
		/*여기에 쓰면 구분도 잘 안되고 비효율적임 Caller에 쓰자!
		try{
			return a/b;
		}
		catch(Exception e) {
			return -1;
		}
		*/
	}
}
