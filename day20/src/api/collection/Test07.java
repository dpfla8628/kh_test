package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("이름 입력 : ");
		for(int i=0; i<num; i++) {
			String name = sc.next();
			list1.add(name);
		}
		System.out.println("당첨 항목 입력 : ");
		for(int i=0; i<num; i++) {
			String gift = sc.next();
			list2.add(gift);
		}

		Collections.shuffle(list2);
		
		for(int i=0; i<num; i++) {
		System.out.println("이름 : "+list1.get(i)+" | 당첨 상품 : "+list2.get(i)+"\t");	
		}
	}
}
