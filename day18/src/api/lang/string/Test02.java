package api.lang.string;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = s.next();
		System.out.print("비번 입력 : ");
		String pas=s.next();
		
		//contentEquals도 가능 : String이 아니라 다른 클래스와도 비교 가능하다
		if(id.equals("khacademy")&&pas.equals("master")) {
			System.out.println("로그인 성공");
		}
		else{
			System.out.println("로그인 실패");
		}
	}
}
