package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test03_2 {
	public static void main(String[] args) throws IOException {
		//Writer를 이용하여 문자열을 변환없이 출력
		//Writer = OutputStream + 변환 가능
		
		//문제점 : 바이트와 문자열만 전송이 가능하고 다른 형태 불가능!!
		
		File target = new File("file","string2.txt");
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("hello");
		pw.println(100);
		pw.println(3.14);
		pw.println(true);
		pw.println("안녕하세요");
		
		pw.close();
	}
}
