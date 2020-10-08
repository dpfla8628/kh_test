package array;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//배열 선언과 동시에 값 설정
		int a[] = new int[] {60,80,75,85,90,95,93,77,62,85};
		int sum=0;
		double avg=0;//float도 가능
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
			avg=(double)sum/a.length;}
		System.out.println("평균 : "+avg);
		
		int new_s=82;
		int rank=1;
		for(int i=0; i<a.length; i++) {
			if(new_s<a[i]) {
				rank++;
			}
		}
			System.out.println("새로운 학생의 등수 : "+rank);
		
		
	}

}
