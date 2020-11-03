package quiz;

import java.util.ArrayList;

public class Test2_03 {
	public static void main(String[] args) {

			ArrayList<Book> bookList = new ArrayList<Book>();

			bookList.add(new Book("자바를 잡아라", 30000));
			bookList.add(new Book("오라클 정복", 35000));
			bookList.add(new Book("웹표준 2.0", 27500));
			bookList.add(new Book("자바 Servlet/JSP", 28000));
			bookList.add(new Book("ajax 사용법", 15000));
			System.out.println(bookList);
		}
}
