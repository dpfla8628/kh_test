package test01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임 시작");
		
		do {
			System.out.println("가위 바위 보 중 한개를 입력하세요:");
			String input = sc.nextLine();
			System.out.println("내가낸거"+input);
			int random=(int)(Math.random()*4);
			String computer="";
			
			switch(random) {
			case 0 :computer="가위"; break;
			case 1 : computer="바위"; break;
			case 2 : computer="보"; break;
			}
			System.out.println("컴이낸거"+computer);
			if(computer==input) {
				System.out.println("비김");break;
			}
			else {
				boolean win = false;
				
				if(computer=="가위") {
					if(input=="바위") {
						win=true;
					}
				}else if(computer=="바위") {
					if(input=="보") {
						win=true;
					}
					}else {
						if(input=="가위") {
							win=true;
						}
					}
					if(win) {
						System.out.println("이김");break;
					}
					else {
						System.out.println("짐");
						break;
					}
				}
			
			}while(false);	
	}
}
