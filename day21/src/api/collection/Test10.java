package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test10 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i =1; i<=10; i++) {
			list.add(i);
		}
		Collections.shuffle(list);//랜덤
		System.out.println(list);
		
		Collections.sort(list);//오름차순
		System.out.println(list);
		
		
		//내림차순처럼 별도의 정렬 방식을 구현하려면 정렬에 해당하는 객체 생성
		//Comparator , Comparable
		//인터페이스는 객체를 만들 수 없다!!!!!
		//따라서 자료형도 정해주고 오버라이드로 해줘서 만들어주자
		
		//재정의한 메소드에서 0을 반환하게 되면 현상유지를 하라는 뜻(통과)
		//재정의한 메소드에서 양수(1)를 반환하게 되면 두 자리를 바꾸라는 뜻(잘못된 상태)
		//재정의한 메소드에서 음수(-1)를 반환하게 되면 두 자리를 유지하라는 듯(올바른 상태)
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;//내림차순
				
				//return o1 - o2 //오름차순
				
//				if(o2>o1) {
//					return 1 ;
//				}
//				else {
//					return -1;
//				}
			}
		};
		
		Collections.sort(list,c);//c 내림차순
		System.out.println(list);
		
		//람다를 이용한 Comparator 생성
		Comparator<Integer> d =(o1,o2)->o1-o2;
		
		//=
		//Comparator<Integer> d =(o1,o2)->{
		//	return o2-o1};
		
		
		Collections.sort(list,d);//d 오름차순
		System.out.println(list);
		
	}

}
