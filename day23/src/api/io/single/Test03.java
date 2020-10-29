package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("file","hello.txt");
		File f2 = new File("file","copy.txt");
		
		FileInputStream in = new FileInputStream(f1); 
		FileOutputStream out = new FileOutputStream(f2);
		
		
		for(int i=0; i<f1.length(); i++) {
			out.write(in.read());
		}	
	}
}
