package api.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {		
		System.out.print("레퍼 이름 입력 : ");
		String name = sc.next();
		
		if(name.equals("그만")) {
			sc.close();
			break;
		}
		//래퍼 없으면
		if(!m.containsKey(name)) {
			m.put(name,1);
			System.out.println("["+name+"]를 입력하셨습니다. 현재 득표 수 : "+m.get(name));
		}
		//래퍼 있으면 - 투표수 증가
		else {
			int score = m.get(name);
			score++;
			m.put(name,score);
			System.out.println("["+name+"]를 입력하셨습니다. 현재 득표 수 : "+score);
			
		}
		}
	}
}
