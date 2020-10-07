//Scanner
//정수 : nextint() 실수 : nextdouble() 문자열(string) : next()
package java_package;

import java.util.Scanner;

public class JavaClass_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력:");
		String name = scan.next();
		System.out.print("나이 입력:");
		int age = scan.nextInt();
		System.out.println("이름:"+name+"\n나이:"+age);
		
		/* 구구단
		int a= scan.nextInt();
		System.out.println(a + "단 시작 ");
		for(int i=1;i<11;i++) {
		System.out.println(a+"*"+i+"="+a*i);
		*/}
	
}
