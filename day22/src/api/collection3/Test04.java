package api.collection3;

import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		
		Set<String> a = new TreeSet<>();
		Set<String> b = new TreeSet<>();
		
		a.add("살아있다");
		a.add("반도");
		a.add("다만 악에서 구하소서");
		a.add("다크나이트");
		a.add("단 하루의 기적");
		
		b.add("다크나이트");
		b.add("사바하");
		b.add("테넷");
		b.add("반도");
		b.add("살아있다");
		
		//둘 다 본 영화 - 교집합
		Set<String> f = new TreeSet<>(b);
		f.retainAll(a);
		System.out.println(f);
		//철수만 본 영화 - 차집합
		Set<String> d = new TreeSet<>(a);
		d.removeAll(b);
		System.out.println(d);
		//영희만 본 영화 - 차집합
		Set<String> e = new TreeSet<>(b);
		e.removeAll(a);
		System.out.println(e);
		//시청한 모든 영화 - 합집합
		Set<String> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		
		
	}

}
