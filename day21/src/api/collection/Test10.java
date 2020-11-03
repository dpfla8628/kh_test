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
		

		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2 ;
				
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
