//조건문 6일차 과제
package java_package;

import java.util.Scanner;

public class JavaClass_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("인원 수 : ");
		int num = scan.nextInt();
		System.out.printf("여행 기간(달) : ");
		int day = scan.nextInt();
		
		int pay1=100000*num;//할인 받기 전 금액(인원수*인당 요금)
		double pay2=0;//할인 금액
		
		switch(day){
		case 12: case 1: case 2://겨울 5%
			pay2 = 0.05;
			break;
		case 3: case 4: case 5://봄 30%
			pay2 = 0.3;
			break;
		case 6: case 7: case 8://여름 0%
			break;
		case 9: case 10: case 11://가을 15%
			pay2 = 0.15;
			break;
		}
		
		double pay3=(pay1-(pay1*pay2));//할인 받은 후 금액
		
		System.out.println("1.할인 받기 전 금액 : "+pay1+ "\n2.할인 금액 : "+(int)(pay2*100)+"%\n3.할인받은 후 금액 : "+(int)pay3);
	}

}