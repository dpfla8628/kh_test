package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		//List를 만들어 이번주 예상 로또번호를 6개 추첨하여 저장 후 출력
		//api를 이용하려 중복이 없도록 저장소에 추가
		
		List<Integer> a =new ArrayList<>();
	
		Random r = new Random();
		
		for(int i=0; i<6; i++) {
			//랜덤
			int n = r.nextInt(45)+1;
			//중복 제거
			
			if(!a.contains(n)) {
				a.add(n);
			}
			else {
				System.out.println("중복!");
				i--;//i++와 만나서 한번 상쇄됨! 한번 더 실행
			}
		}
		 
		 System.out.println(a);
		 
		//=for(int n : a)
		 //System.out.println(n);
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
				
	}

}
