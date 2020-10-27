package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test06_A {
	public static void main(String[] args) {
		List<String> friends = new ArrayList<>();
		friends.add("철수");
		friends.add("영희");
		friends.add("영수");
		friends.add("민지");
		friends.add("미영");
		friends.add("민수");
		
		Collections.shuffle(friends);
		
		//1.무작위로 섞인 friends 저장소에서 데이터 2개 추첨 = String 2개 추첨
		//2.무작위로 섞인 friends 저장소에서 데이터 2개 묶을을 추첨 = List<String> 추첨
		//=>같은 말이지만 자료형이 다르다
		/*1.
		String a =friends.get(0);
		String b = friends.get(1);
		System.out.println(a);
		System.out.println(b);
		*/
		List<String> sub = friends.subList(0, 2);
		System.out.println(sub);
	}

}
