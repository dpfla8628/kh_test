package api.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		//List(리스트) : 순서가 유지되는 대용량 저장소
		//ArrayList : 배열 형태로 붙어있는 저장소
		//LinkedList : 연결 형태로 떨어져있는 저장소
		
		//생성
		//ArrayList a =new ArrayList();
		//List a = new ArrayList();//Object가 저장(비추천)
		//List<Object> a = new ArrayList<>();
		List<?> a =  new ArrayList<>();//Object는 ?로 대체가 가능
		
		//LinkedList b = new LinkedList();
		List b = new LinkedList();//Object가 저장(비추천)
		
		//int[] c = new int[5];
		//String[] d = new String[5];
		
		//추천되는 방식 - 제네릭(Generic)을 사용하여 형태를 명시
		List<String> e = new ArrayList<String>();//String만 저장되는 저장소
		List<String> f = new ArrayList<>();//이것도 가능
		
		//데이터 추가 : add() , Generic에 명시된 형태만 추가 가능
		e.add("한국");
		e.add("중국");
		e.add("파푸아뉴기니");
		e.add("탄자니아");
		e.add("오스크만제국");
		
		//개수 확인 : size()
		System.out.println(e.size());
		System.out.println(f.size());
		
		//저장소 출력
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		
		//f가 비어있는지 확인하는 조건
		if(f.isEmpty()) {//=f.size()==0
			System.out.println("f는 비어있습니다");
		}
		
	}
}
