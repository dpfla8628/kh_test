package loop2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
	//사용자가 0을 입력할 때까지 숫자를 입력 받는 프로그램
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자 입력 (0이면 종료)");
			int user = scan.nextInt();
			
			if(user==0) {
				break;
			}
			
		}System.out.println("프로그램 종료");
}
}
