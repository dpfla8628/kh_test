package api.util.scanner;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//Scanner를 이용하여 통로(stream)를 읽을 수 있다
		//표준 입력 통로(System.in)을 읽을 수 있다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력");
		
		//String input = sc.next();//한 단어
		String input = sc.nextLine();//한 문장
		//String input = sc.nextInt());//정수
		
		System.out.println(input);
		
		sc.close();
		
		
	}

}
