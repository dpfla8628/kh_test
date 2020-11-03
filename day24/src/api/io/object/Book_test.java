package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Book_test {
	public static void main(String[] args) throws Exception {

		Book b  = new Book("자바를 정복하자",35000);
		
		File target = new File("file","book.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream object = new ObjectOutputStream(buffer);
		
		b.fileSave(b.getTitle());
		
		object.writeObject(b);
		
		object.close();		
	}
}
