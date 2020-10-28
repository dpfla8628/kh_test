package api.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Map<String, String>map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			if(id.equals("그만")) {
				sc.close();
				break;
			}
			System.out.print("비번 입력 : ");
			String pass = sc.next();
			
			if(map.containsKey(id)) {
				System.out.println("이미 사용중인 아이디입니다\n");
			}
			else {
				System.out.println("가입이 완료되었습니다\n");
				map.put(id,pass);
			}
		}
		System.out.println("만들어진 아이디 : "+map);	
	}
}
