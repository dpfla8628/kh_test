package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.Date;

public class Test04_arr {
	public static void main(String[] args) throws Exception {
		//입력
		File target = new File("file","numbers.kh");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream object = new ObjectInputStream(buffer);
		
		int [] arr = (int[])object.readObject();
		object.close();
		
		System.out.println(Arrays.toString(arr));	
	}

}
