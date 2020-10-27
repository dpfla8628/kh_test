package api.collection2;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		//Student를 저장할 수 있는 List 구현
		//Student = String+int
		//리스트 생성
		List<Student> list = new ArrayList<>();
		
		//추가 명령 : .add(E)
		// : 데이터는 한개만 추가할 수 있다!!
		
		//Student st = new Student("홍길동",70);
		//list.add(st);
		list.add(new Student("홍길동",70));
		list.add(new Student("피카츄",90));
		list.add(new Student("터미네이터",50));
		
		System.out.println(list);//참조변수(리모컨)일뿐
		
		//개수확인 : size()
		System.out.println(list.size());
		
		//출력 (상자를 두번 열자)
		System.out.println(list.get(0));//참조변수(레퍼런스)
		System.out.println(list.get(0).getName());
		
		//전체 출력
		//=for(Student stu : list) / stu.getName()
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getScore());
		}
	}

}
