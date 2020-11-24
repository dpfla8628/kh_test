package ncs.test7;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		
			System.out.println("입력하세요");
		
			
			String name = sc.next();
		
			if(name.equals("종료")) {break;}
			
			System.out.println(name);
		}
	}

}
