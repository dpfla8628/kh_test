package quiz;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Book {
	private String title;
	private int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public Book() {}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//toString() 메소드를 오버라이딩하여 인스턴스변수의 값에 대한 문장을 작성하여 리턴한다.
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	//fileSave() 메소드를 작성하시오. : public void fileSave(String fileName){}
	public void fileSave(String fileName) throws Exception {
		//Book 객체 샘플 : "자바를 정복하자", 35000
		Book book = new Book("자바 정복",35000);
		
		//전달받은 fileName 으로 파일 객체를 생성
		File target = new File(fileName);
		//파일 객체와 연결하는 파일 출력스트림을 생성
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		//파일에 Book 객체를 기록할 수 있는 객체 출력스트림을 추가
		ObjectOutputStream object = new ObjectOutputStream(buffer);
		//파일에 Book 객체 정보를 기록하고 스트림들을 닫는다.
		object.writeObject(book);
		object.close();
	
	}


}
