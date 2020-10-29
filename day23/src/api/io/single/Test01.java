package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//목표 : 바이트 단위의 입출력을 이해하는 것
		//준비물 : 
		//1.파일 객체(File)
		//2.입력일 경우 입력통로(FileInputStream),
		//	출력일 경우 출력통로(FileOutputStream)
		
		//1.바이트 출력(저장)
		//파일이 없으면 자동으로 생김
		File target = new File("file","single.kh");
		FileOutputStream out = new FileOutputStream(target);
		
		//[프로그램] ->out -> target ->[single.kh]
		//out에게 데이터(byte)를 전달하여 출력 지시
		
		out.write(65);//A
		out.write('B');
		out.write(9);//tab키
		out.write(104);//h
		out.write(101);//e
		out.write(10);//\n
		
		//매개변수가 int긴하지만 byte값을 넣어야 된다
		out.write(30000);
		//30000을 넣었는데 48(0)으로 변해도 들어갔다. (byte)30000
		
		//통로는 다 썼으면 close
		out.close();
		
		
	}

}
