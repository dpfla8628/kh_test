package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test03_1 {
	public static void main(String[] args) throws IOException {
		//Writer를 이용하여 문자열을 변환없이 출력
		//Writer = OutputStream + 변환 가능
		
		//문자열도 여러개의 바이트를 전송하는 형태이므로 버퍼를 쓰면 좋다
		//FileWriter에도 버퍼가 내장되어있긴 하지만 성능이 안좋다
		//BuffetedWriter를 사용하여 버퍼 성능 향상
		//:기능상의 차이는 없고 단지 성능이 향상됨!
		
		//문제점 : 바이트와 문자열만 전송이 가능하고 다른 형태 불가능!!
		
		File target = new File("file","string2.txt");
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("안녕");
		bw.write("hello");
		bw.write(100);
		
		bw.close();
	}
}
