package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Test06_A {
	public static void main(String[] args) throws Exception {
		File f1 = new File("file","hello.txt");
		File f2 = new File("file","copy.txt");
		
		FileInputStream in = new FileInputStream(f1); 
		FileOutputStream out = new FileOutputStream(f2);
	
		byte[]data = new byte[6];
		
		while(true) {
			int size = in.read(data);
			if(size==-1)break;
			out.write(data,0,size);
		}
		in.close();
		out.close();
	}
}
