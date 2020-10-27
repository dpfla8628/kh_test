package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test07_A {
	public static void main(String[] args) {
		//사다리 타기 게임
		//1.인원수 설정
		//2.이름과 항목 입력
		//3.사다리가 나오고 애니메이션 추첨
		//4.추첨 결과 출력
		
		int people = 3;
		
		//이름 3번+항목2번 입력후 저장
		List<String>names = new ArrayList<>();
		List<String> actions = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		//이름 입력
		for(int i=0; i<3; i++) {
			System.out.println("이름 입력");
			names.add(sc.next());
		}
		//항목 입력
		for(int i =0; i<3; i++) {
			System.out.println("항목 입력");
			actions.add(sc.next());
		}
		sc.close();
		
		//System.out.println("names = "+names);
		
		Collections.shuffle(actions);
		//System.out.println("actions = "+actions);
		
		for(int i =0 ; i<3; i++) {
			System.out.println(names.get(i)+"->"+actions.get(i));
		}
		
	}

}
