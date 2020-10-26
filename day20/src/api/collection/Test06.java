package api.collection;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		
		list.add("철수");
		list.add("영희");
		list.add("영수");
		list.add("민지");
		list.add("미영");
		list.add("민수");
		
		List<String> win = new ArrayList<>();
		
		for(int i=0; i<2; i++) {
			int ran = (int)(Math.random()*6+0);//랜덤

			if(!win.contains(list.get(ran))){//중복검사
				win.add(list.get(ran));}
			else {
				i--;}
			}
		System.out.println("당첨자!"+win);
		}
	}
