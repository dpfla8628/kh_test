package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1_02 {
	public static void main(String[] args) {

//		List<String> title = new ArrayList<>();
//		title.add("나다라");
//		title.add("가나다");
//		title.add("다라마");

		Comparator<Book> c = new Comparator<Book>(){
			@Override
			public int compare(Book o1, Book o2){
				return o1.getTitle().compareTo(o2.getTitle());
			}
		};
		//Collections.sort(title,c);
		System.out.println(c);
	}
}

//@Override

//public int compare(Object o1, Object o2){
//
//int result = 0;
//
//if(o1 instanceof Book && o2 instanceof Book){
//
//Book b1 = (Book)o1;
//
//Book b2 = (Book)o2;
//
//result = (b1.getTitle()compareTo(b2.getTitle()) > 0)? 1 : ((b1.getTitle().compareTo(b2.getTitle()) < 0) ? -1 : 0);
//
//}
//
//return result;
