//연산자_실습문제
package java_package;

import java.util.Scanner;

public class Test_Q_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
/*1번)  키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
                양수가 아니면 “양수가 아니다“를 출력
 
		System.out.printf("정수 : ");
		int a = scan.nextInt();
		System.out.println(a>0?"양수다":"양수가 아니다");
		/* if문
		   if(a>0){
		   		System.out.println("양수다");
		   		}
		   	else{
		   		System.out.println("양수가 아니다");
		   		}
		   	System.out.println("프로그램 끝");
*/
		
/*2번) 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
              양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력
              
		System.out.printf("정수 : ");
		int a = scan.nextInt();
		System.out.println((a>0)?"양수다":(a==0)?"0이다":"음수다");
*/
		
/*3번) 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 
              짝수가 아니면 “홀수다“를 출력 
              
		System.out.print("정수 : ");
		int a = scan.nextInt();
		
		if (a%2==0) {
			System.out.println("짝수다");
			}
		else {
			System.out.println("홀수다");
		}
*/
		
/*4번) 인원 수와 사탕 개수를 키보드로 입력 받고
	  1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력
	  
		System.out.printf("인원 수 : ");
		int a = scan.nextInt();
		if(a>0) {
			System.out.printf("사탕 개수 : ");
			int b=scan.nextInt();
			
			System.out.println("1인당 사탕 개수 : "+(b/a));
			System.out.println("남은 사탕 개수 : "+(b%a));}
		else {
			System.out.println("0으로 나눌 수 없음");
		}
*/

/*5번)  키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력
  		이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력
  		
		System.out.printf("이름 : ");
		String name = scan.next();
		System.out.printf("학년(숫자만) : ");
		int grade = scan.nextInt();
		System.out.printf("반(숫자만) : ");
		int clas = scan.nextInt();
		System.out.printf("번호(숫자만) : ");
		int num = scan.nextInt();
		System.out.printf("성별(M/F) : ");
		String sex = scan.next();
			if(sex.equals("m")||sex.equals("M")){
				sex="남";}
			else if(sex.equals("f")||sex.equals("F")){
				sex="여";}
			//OR char sex=='M'일 때 sout->남학생,아니라면 sout->여학생
		System.out.printf("성적(소수점 아래 둘째자리까지) : ");
		Double score = scan.nextDouble();
		
		System.out.println(grade+"학년 "+clas+"반 "+num+"번 "+name+" "+sex+"학생의 성적은 "+score+"이다.");
*/	
		
/*6번) 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
		성인(19세 초과)인지 출력
		
		System.out.printf("나이 : ");
		int age = scan.nextInt();
		
		if(age<=13) {
			System.out.println("어린이");}
		else if(age>13 && age<=19) {
			System.out.println("청소년");}
		else {
			System.out.println("성인");
		}
*/
		
/*7번) 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
	     세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	     세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력
	     
		System.out.printf("국어 : ");
		int kor = scan.nextInt();
		System.out.printf("영어 : ");
		int eng = scan.nextInt();
		System.out.printf("수학 : ");
		int math = scan.nextInt();
		
		double avg=((kor+eng+math)/3);
		int sum=(kor+eng+math);
				
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		if(kor>=40&&eng>=40&&math>=40&&avg>=60) {
			System.out.println("합격");}
		else {
			System.out.println("불합격");}
*/
	
/*8번) 주민번호를 이용하여 남자인지 여자인지 구분하여 출력
 * 
		System.out.printf("주민번호를 입력하세요(- 포함) : ");
		String num = scan.next();
		if(num.charAt(8)==2) {
			System.out.println("여자");}
		else {
			System.out.println("남자");}
*/
	
/*9번) 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		아니면 false를 출력하세요.
		(단, num1은 num2보다 작아야 함)
		
		System.out.printf("정수1 : ");
		int num1 = scan.nextInt();
		System.out.printf("정수2 : ");
		int num2 = scan.nextInt();
		if(num1>num2) {
			System.out.println("정수1은 정수2보다 작아야 함");
		}
		else {
		System.out.printf("입력 : ");
		int check = scan.nextInt();
		
		if(check<=num1||check>num2) {
			System.out.println("true");}
		else {
			System.out.println("false");}
		}
*/	
		
/*10번) 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 
  	        아니면 false를 출력
		
		System.out.print("입력1 : ");
		int num1 = scan.nextInt();
		System.out.print("입력2 : ");
		int num2 = scan.nextInt();
		System.out.print("입력3 : ");
		int num3 = scan.nextInt();
		
		if(num1==num2&&num2==num3) {
			System.out.println("true");}
		else {
			System.out.println("false");}
*/		
		
/*11번)	A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
		(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)	
		
		System.out.print("A사원의 연봉 : ");
		int a_sal = scan.nextInt();
		System.out.print("B사원의 연봉 : ");
		int b_sal = scan.nextInt();
		System.out.print("C사원의 연봉 : ");
		int c_sal = scan.nextInt();
		
		double a_plus = a_sal+(a_sal*0.4);
		double b_plus = b_sal;
		double c_plus = c_sal+(c_sal*0.15);
		
		System.out.println("A사원 연봉/연봉+a : "+a_sal+"/"+a_plus);
		if(a_plus>=3000) {
			System.out.println("3000 이상");}
		else {
			System.out.println("3000 미만");}
		System.out.println("B사원 연봉/연봉+a : "+b_sal+"/"+b_plus);
		if(b_plus>=3000) {
			System.out.println("3000 이상");}
		else {
			System.out.println("3000 미만");}
		System.out.println("C사원 연봉/연봉+a : "+c_sal+"/"+c_plus);
		if(c_plus>=3000) {
			System.out.println("3000 이상");}
		else {
			System.out.println("3000 미만");}
*/
		
	}
}
