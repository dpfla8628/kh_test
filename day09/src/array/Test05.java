//사용자에게 이번주 로또번호를 입력 받아서 순서대로 출력하는 프로그램
//1~45사이의 숫자 6개
package array;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a[]= new int[6];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("로또 번호 입력 : ");
			a[i] = scan.nextInt();	
		}
		System.out.printf("입력한 번호 : %d,%d,%d,%d,%d,%d",a[0],a[1],a[2],a[3],a[4],a[5]);
	}

}
