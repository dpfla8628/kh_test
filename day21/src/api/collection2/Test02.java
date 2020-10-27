package api.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		List<Member> mem = new ArrayList<>();
		
		mem.add(new Member("tester", "test1234"));
		mem.add(new Member("master", "master1234"));
		mem.add(new Member("user", "user1234"));
		mem.add(new Member("admin", "admin1234"));
		
		System.out.println(mem.size());
		
		//Collections.sort(list); //Member를 어떻게 정렬해야할지 몰라서 오류
		
		//o1 - the first object to be compared.
		//o2 - the second object to be compared.
		//임의의 객체 두개를 매개변수로 잡고, 차례로 둘씩 비교해가며 정렬을 한다
		//여기에서는 Member의 매개변수가 두개이므로 id와 pass중 어떤것을 비교할지 모르니까
		//아이디끼리 비교해라!! 라는 의미로 a.getId()랑 b.getId()를 비교해서 오름차순한다
		
		Comparator <Member> c = (a,b)->a.getId().compareTo(b.getId());
		Collections.sort(mem,c);
		
		for(int i=0; i<mem.size(); i++) {
			System.out.println("아이디 : "+mem.get(i).getId());
			System.out.println("비밀번호 : "+mem.get(i).getPas());
		}
		
		
		
		
	}

}
