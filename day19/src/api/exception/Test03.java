package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
	
		try {//감시 블록
			Scanner sc = new Scanner(System.in);
			System.out.println("사과 개수를 입력하세요");
			int apple = sc.nextInt();
			System.out.println("인원수를 입력하세요");
			int people = sc.nextInt();
			
			System.out.println("한사람당 사과를 "+apple/people+"개씩 먹을 수 있어요");
			System.out.println("사과는 "+apple%people+"개가 남아요");
		}
		
		catch(Exception e) {
			//오류발생 메세지 발생! 하지만 어디서 났는지 모름..
			System.err.println("오류 발생!");
			//원인 분석!(없으면 null나옴)
			System.err.println(e.getMessage());
			//예외처리를 안한 것처럼 기록을 남겨
			//오류를 분석할 수 있게 해준다(개발 끝나면 삭제)
			e.printStackTrace();
		}
	}
}
