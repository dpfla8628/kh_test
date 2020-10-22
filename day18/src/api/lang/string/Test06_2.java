package api.lang.string;

import java.util.Scanner;

public class Test06_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String given = "카센타";
		System.out.println(given+"쿵쿵따!");
		
		while(true) {
			String input=sc.next();
			
			boolean isNotThree = input.length()==3;
			String end = given.substring(given.length()-1);//마지막 글자
			String start = input.substring(0,1);//첫번째 글자
			boolean isNorConnect = start.equals(end);
			
			if(!(isNotThree && isNorConnect)) {
				System.out.println("게임 오버!");break;
			}
			System.out.println(input+"! 쿵쿵따!");
			given=input;//제시어를 입력값으로 교체하는 코드
		}
	}
}
