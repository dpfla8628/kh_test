package api.collection3;

import java.util.Set;
import java.util.TreeSet;

public class Test03 {
	public static void main(String[] args) {
//		Set은 "집합연산"에 특화되어있다
//		합집합 : 두 개의 집합의 합
//		교집합 : 두 개의 집합의 곱
//		차집합 : 두개의 집합의 차
		
		Set<Integer> a = new TreeSet<>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Set<Integer> b = new TreeSet<>();
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		
		//합집합 : 비어있는 Set을 만들어서 a,b를 몽땅 추가
		Set<Integer> c = new TreeSet<>();
		c.addAll(a);
		c.addAll(b);
		System.out.println(c);//중복제거됨!!
		
		//교집합 : retainAll : c랑 a랑 겹치는게 뭔지
		//c.retainAll(a);
		//System.out.println(c);
	
		Set<Integer> d = new TreeSet<>(a);//a를 복제해서 d를 생성
		d.retainAll(b);//a⌒b
		System.out.println(d);
	
		//차집합 : removeAll
		Set<Integer> e =new TreeSet<>(a);
		e.removeAll(b);//a-b
		System.out.println(e);
}
}
