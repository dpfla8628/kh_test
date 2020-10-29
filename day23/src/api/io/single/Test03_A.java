package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03_A {
	public static void main(String[] args) throws IOException {
		//준비물
		//1.입력용 파일 객체, 입력용 스트림
		//2.출력용 파일 객체, 출력용 스트림
		File f1 = new File("file","hello.txt");//입력용파일
		File f2 = new File("file","copy.txt");//출력용파일
		
		FileInputStream in = new FileInputStream(f1); 
		FileOutputStream out = new FileOutputStream(f2);
		
		//[hello.txt]->origin->in->[프로그램]->out->dest->[copy.txt]
		
		//복사가 얼만큼 진행되었는지 확인하기 위한 처리를 추가
		long total = f1.length();
		long copy = 0L;
		
		while(true){
			int data = in.read();
			if(data==-1) break;
			out.write(data);
			
			copy++;
			double percent = copy*100.0/total;
			System.out.println(copy+"/"+total+"("+percent);
		}
		in.close();
		out.close();
	}
}
