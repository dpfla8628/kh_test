/*
 * 배열에 있는 짝수의 개수를 세어 출력
 * 배열에 있는 숫자의 합계 & 평균
 */
package array;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		int a[]= new int[] {3,5,2,1,4};
		
		int count=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				count++;
			}
		}System.out.println("짝수의 개수 : "+count);
		
		int sum=0;
		double avg=0;
		for(int i=0;i<a.length; i++) {
			sum+=a[i];
			avg=(double)sum/a.length;
			//평균은 강제 형변환 꼭 해주기! 소수점 주의!!
		}	
		System.out.println("배열의 합 : "+sum);
		System.out.println("배열의 평균 : "+avg);
		
	}

}
