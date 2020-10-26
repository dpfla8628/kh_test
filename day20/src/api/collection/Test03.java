package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//List에 숫자를 5개 저장 후 출력
		//주의  : Generic에는 Reference Type(참조형)만 적을 수 있다.
		//이유 : null이 포함될 수 있기 때문에
		
		 List<Integer> a = new ArrayList<>();
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("숫자 5개 입력");
		 
		 for(int i=0; i<5; i++) {
			 a.add(sc.nextInt());
		 }
		 sc.close();
		
		 System.out.println(a);
		 System.out.println("사이즈 : "+a.size());
		 
		 //데이터 출력
		 for(int i=0; i<a.size(); i++) {
			 System.out.println(a.get(i));
		 }
		 /*=
		 for(int n:a) {
			 System.out.println(n);
		 }
		 */
		 
	}

}
