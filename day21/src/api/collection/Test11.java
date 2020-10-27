package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test11 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("자바");
		list.add("파이썬");
		list.add("C언어");
		list.add("자바스크립트");
		list.add("루비");
		
		//오름차순
		Collections.sort(list);
		System.out.println(list);
		
		//내림차순 (but한정적)
		//Collections.sort(list,Collections.reverseOrder());
		
		Comparator<String> c =(a,b)->b.compareTo(a);
		Collections.sort(list,c);
		System.out.println(list);
		
		
	}
}
