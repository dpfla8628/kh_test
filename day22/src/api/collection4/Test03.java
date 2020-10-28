package api.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		
		m.put("admin","admin1234");
		m.put("user","user1234");
		m.put("master","master1234");
		m.put("test","test1234");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요 : ");
		String pass = sc.next();
		
		//로그인 성공이라면..
		//아이디 존재 && 비밀번호 일치
		//아이디에 맞는 비번을 찾아야됨 (get)
		if(m.containsKey(id) && m.get(id).equals(pass)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
		
		sc.close();
	}
}
