package api.collection4;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//Map<K,V>
		//두개의 데이터를 세트로 저장하는 저장소
		//K : key : 이름 역할을 수행하며 중복 불가능(set)
		//V : value : 값의 역할을 수행하며 중복 가능
		
		//저장소 생성
		Map<String, Integer>map = new HashMap<>();
		
		//데이터 추가
		map.put("c", 30);//순서 무시됨
		map.put("a", 10);
		map.put("b", 20);
		map.put("a", 20);//중복된 이름은 수정됨
		
		
		//데이터 개수 및 확인
		System.out.println(map.size());
		System.out.println(map);
		
		//데이터 검색
		System.out.println(map.containsKey("a"));//key에 a가 있냐
		System.out.println(map.containsValue(20));//value에 20이 있냐
		
		//데이터 삭제 : key로 지우던가 아니면 key+value로 삭제(구분을 위해)
		//map.remove("b");
		//map.remove("a",20 );
		//System.out.println(map);
		
		//데이터 추출 : key로 value를 불러오는 것만 가능하다
		//주의사랑 : value를 int 형태로 사용하면 위험하다
		//만약에 null이 나올 가능성이 있다면 int 대신 Integer를 사용하자!
		//null은 참조형에서만 나오기때문
		Integer value = map.get("a");
		System.out.println(value);
	}

}
