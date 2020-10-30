package api.io.string;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//Writer를 이용하여 문자열을 변환없이 출력
		//Writer = OutputStream + 변환 가능
		
		File target = new File("file","string2.txt");
		FileWriter fw = new FileWriter(target);
		
		fw.write("안녕");
		fw.write("hello");
		
		fw.close();
	}
}
