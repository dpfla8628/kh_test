package api.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test05 {
	public static void main(String[] args) {
		//Map도 전체 출력이 가능하긴하다
		
		//저장소
		Map<String,String> db = new HashMap<>();
		
		//데이터 추가
		db.put("admin","admin1234");
		db.put("user","user1234");
		db.put("master","master1234");
		db.put("test","test1234");
		
		//1.Map은 Key를 알면 value를 알 수 있다
		//2.Map에서 key만 뽑아놓고 명령이 있는지 알아야 한다
		//3.Map에서 key만 놓고보면 Set형태이다
		
		//(1) Map에 있는 key들만 모아서 Set으로 추출 : .keySet
		Set<String> s = db.keySet();
		System.out.println(s);
		//(2) Set을 확장 반복문으로 반복하며 id에 접근
		//(3) 비밀번호는 id를 이용해서 get 명령으로 불러온다
		for(String id : s) {
			System.out.println(id);
			System.out.println(db.get(id));
		}
	}

}
