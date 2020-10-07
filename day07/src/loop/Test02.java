//사용자에게 이번주 로또번호를 입력받는 프로그램

package loop;

import java.util.Scanner;


public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<7;i++) {
			System.out.printf(i+"번 째 로또 번호 입력 : ");
			int lotto=scan.nextInt();
		}

	}

}