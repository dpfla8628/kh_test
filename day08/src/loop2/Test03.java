/*##Test04
 * 사용자에게 짝수를 입력받는 프로그램
 * 사용자가 홀수를 입력하면 프로그램 종료
 * 사용자가 입력한 숫자의 합계를 출력
 */

package loop2;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int sum=0;
		
		while(true) {
			System.out.print("숫자 입력(홀수 입력시 종료):");
			int num = scan.nextInt();
			
			if(num%2!=0) {	
				System.out.println("짝수 합계 : "+sum);
				break;
			}	
			sum+=num;
		}

	}

}
