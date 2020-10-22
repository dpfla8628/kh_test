package api.lang.string;

import java.util.Scanner;

public class Test06_1 {
	public static void main(String[] args) {
		//두 단어를 입력받아 서로 이어지는지
		//substring, endswitch, startswitch
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 입력");
		String first=sc.next();
		System.out.println("두번째 입력");
		String second=sc.next();
		
		char end = first.charAt(first.length()-1);//마지막
		char start = second.charAt(0);//첫글자
		System.out.println("마지막 글자 : "+end);
		System.out.println("처음 글자 : "+start);
		
		System.out.println(start==end);
		/*=
		String end = first.substring(first.length()-1);//마지막 글자
		String start = second.substring(0, 1);//첫 글자
		System.out.println("마지막 글자 : "+end);
		System.out.println("처음 글자 : "+start);
		
		System.out.println(start == end);
		System.out.println(start.equals(end));//원시형은 불가능
		*/
	}

}
