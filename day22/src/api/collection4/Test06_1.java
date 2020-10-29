package api.collection4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test06_1 {
	public static void main(String[] args) {
		//Iterator : 반복자 / 특정 저장소를 자동으로 순회하고 싶을 때 사용
		
		List<String> list = new ArrayList<>();
		list.add("빨");
		list.add("주");
		list.add("노");
		list.add("초");
		list.add("파");
		list.add("남");
		list.add("보");
		
		//Iterator는 만드는게 아니라 얻어내는 것
		//Iterator에는 제네릭 형태를 반드시 지정해야한다
		// :전체를 추출할 수 있다
		// :확장 반복문과 하는 행동이 비슷하다
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {//값이 있는 동안 반복
			System.out.println(iter.next());//공백 기준
		}
		//위랑 같은거임! Iterator이 오리지날임
		for(String str : list) {
			System.out.println(str);
		}
		
		
		String str = "빨 주 노 초 파 남 보";
		Scanner sc = new Scanner(str);
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
		
		
	}

}
