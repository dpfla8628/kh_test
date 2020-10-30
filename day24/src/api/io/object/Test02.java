package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) throws Exception {
		//객체 입력
		File target = new File("file","object.txt");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream object = new ObjectInputStream(buffer);
		
		//[프로그램] <- object <- buffer <- in <- target <- [object.txt]
		//읽은 명령도 1개 : readObject
		
		Date d = (Date) object.readObject();
		
		object.close();
		
		System.out.println(d);	
	}

}
