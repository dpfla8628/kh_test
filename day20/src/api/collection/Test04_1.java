package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {
		//List를 만들어 이번주 예상 로또번호를 6개 추첨하여 저장 후 출력
		//api를 이용하려 중복이 없도록 저장소에 추가
		List<Integer> lotto =new ArrayList<>();
	
		Random r = new Random();
		
		//중복이 안생기건 같에 size()를 기준으로 반복을 진행
		//횟수는 모르지만 종료 시점은 size() ==6 (0~5)
		//반대로 실행 시점은 size()<6
		while(lotto.size()<6) {
			int num = r.nextInt(45)+1;
			if(!lotto.contains(num)){//없으면
				lotto.add(num);
			}
		}
		 
		 System.out.println(lotto);
		 
		//=for(int n : a)
		 //System.out.println(n);
		for(int i=0; i<lotto.size(); i++) {
			System.out.println(lotto.get(i));
		}
		
	}

}
