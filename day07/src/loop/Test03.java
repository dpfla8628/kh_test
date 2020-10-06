
//카운트다운 프로그램

package loop;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		/*
		for(int i=10; i>=0; i--) {
			System.out.println(i);
		}*/
		Scanner scan =new Scanner(System.in);
		System.out.printf("시작 숫자 입력 : ");
		int a=scan.nextInt();
		for(int i=a; i>=0; i--) {
			System.out.println(i);
		}

	}

}
