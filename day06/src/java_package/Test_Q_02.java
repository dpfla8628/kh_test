//조건문_실습문제
package java_package;

import java.util.Scanner;
//import.java.lang.*;

public class Test_Q_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
/*1) 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
	   종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
	   
		System.out.printf("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n메뉴 번호를 입력하세요 : ");
		int num = scan.nextInt();
		
		switch(num){
		case 1 : System.out.println("입력 메뉴입니다.");break;
		case 2 : System.out.println("수정 메뉴입니다.");break;
		case 3 : System.out.println("조회 메뉴입니다.");break;
		case 4 : System.out.println("삭제 메뉴입니다.");break;
		case 7 : System.out.println("프로그램이 종료됩니다.");break;}
*/
/*2)		
		System.out.printf("숫자를 한 개 입력하세요 : ");
		int a = scan.nextInt();
		if(a>0 && a%2==0) {
			System.out.println("짝수다");
		}
		else if(a>0 && a%2!=0) {
			System.out.println("홀수다");
		}
		else {
			System.out.println("양수만 입력해주세요");
		}
*/
/* 3)		
		System.out.printf("국어 점수 : ");
		int kor = scan.nextInt();
		System.out.printf("수학 점수 : ");
		int math = scan.nextInt();
		System.out.printf("영어 점수 : ");
		int eng = scan.nextInt();
		int sum = kor+math+eng;
		double avg=(kor+math+eng)/3;
		if(kor>=40 && math>=40 && eng>=40 &&avg>=60) {
			System.out.println("국어 : "+ kor + "\n수학 : "+math+"\n영어 : "+eng+"\n합계 : "+sum+"\n평균 : "+avg+"\n축하합니다, 합격입니다");
		}
		else {
			System.out.println("불합격입니다.");
		}
*/
/* 3)
		String id = "abc";
		String pass="123";
		
		System.out.printf("아이디 : ");
		String a = scan.next();
		System.out.printf("비밀번호 : ");
		String b = scan.next();
		
		if(id.equals(a)&&pass.equals(b)) {
			System.out.println("로그인 성공");
		}
		else if(id.equals(a)) {
			System.out.println("비밀번호가 틀렸습니다");
		}
		else if(pass.equals(b)) {
			System.out.println("아이디가 틀렸습니다");
		}
*/
		
		
		}
}