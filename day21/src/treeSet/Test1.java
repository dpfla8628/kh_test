package treeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		//Set :
		//전화번호부 형태의 저장소
		//저장 순서가 무시되고 자체적인 기준에 의해 추가되는 저장소
		//구조상 중복이 불가능하다
		
		Set<Integer> a = new TreeSet<>();
		Set<Integer> b = new HashSet<>();
		
		//데이터 등록
		a.add(55);	b.add(55);			
		a.add(32);	b.add(32);	
		a.add(47);	b.add(47);
		a.add(85);	b.add(85);
		a.add(60);	b.add(60);
		a.add(17);	b.add(17);
		a.add(90);	b.add(90);
		
		a.add(90);	b.add(90);//중복 불가
		
		System.out.println(a);
		System.out.println(b);
		
		//개수확인
		System.out.println(a.size());
		System.out.println(b.size());
		
		//탐색 : 
		//a저장소에 77이 있는지 확인
		//b저장소에 90이 있는지 확인
		System.out.println(a.contains(77));
		System.out.println(b.contains(90));
		
		//삭제
		a.remove(55);
		System.out.println(a);
		
		//차이점 : .get()이 없다. 위치가 따로 관리되지 않기 때문에
		//반복은 어떻게 ? 확장 반복문만 가능
		//Iterator이라는 방법 존재
		for(int n : a) {
			System.out.println(n);
		}
		
		
	}

}
