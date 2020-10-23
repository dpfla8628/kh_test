package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
	
//		예외 처리 블록
		//try : 감시 블록
		//catch : 처리블록
		
		try {//감시 블록
			Scanner sc = new Scanner(System.in);
			System.out.println("사과 개수를 입력하세요");
			int apple = sc.nextInt();
			System.out.println("인원수를 입력하세요");
			int people = sc.nextInt();
			
			System.out.println("한사람당 사과를 "+apple/people+"개씩 먹을 수 있어요");
			System.out.println("사과는 "+apple%people+"개가 남아요");
		}
		
//		통합처리
		//예외의 상위 개념 (Object-)Throwable-Exception-RuntimeException
		//Throwable(부모) - (자식)Error,Exception
		//ㄴ>일반적으로 에러는 처리를 안하기 때문에 적절하지 않음!
		//따라서 예외만을 처리하는 최상위인 Exception을 사용하여 한방에 통합처리하자
		catch(Exception e) {
			System.err.println("오류 발생!");
		}
		/*
		catch(ArithmeticException e) {
			//이 오류가 발생하면 정보를  e라는 객체로 전달
			System.out.println("사람이 0이면 안됩니다!!");
		}
		catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요!!");
		}
		*/

//		=>오류가 짧아져서 좋지만 구분이 안된다
	
		
	}
}
