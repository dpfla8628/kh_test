package treeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		Comparator<Integer> c = (a,b) ->b-a;
		Set <Integer> lotto = new TreeSet<>(c);
		
		for(int i =0; i<7; i++) {
			lotto.add((int)(Math.random()*45)+1);
		}
		
		//:lotto에 있는 데이터들을 한바퀴에 한 개씩 n이라는 변수에 담아주세요
		//(전체반복) 확장 반복문
		for(int n : lotto) {
			System.out.println(n);
		}	
	}
}
