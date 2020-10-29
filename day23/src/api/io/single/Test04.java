package api.io.single;

import java.io.File;
import java.io.FileOutputStream;

public class Test04 {
	public static void main(String[] args) throws Exception {//예외 신경 안쓸래
		//한개씩 보내면 너무 느리기 때문에 배열로 다량으로 보낸다
		//바이트 배열 출력
		//준비물 : 파일 객체, 출력용 스트림, 배열(칸수는 맘대로)
		
		File target = new File("file","array.txt");
		FileOutputStream out = new FileOutputStream(target);
		
		byte[] data = new byte[] {104,101,108,108,111,10};//hello\n
		//for문으로 쓸거를 한번에 넣을 수 있다! 효율적
		
		//연결되어 있는 구조는 동일하다
		//[프로그램]->out->target->[array.txt]
		out.write(data);
		out.write(data);
		out.write(data,0,4);//data에 들어있는 값을 0부터 4개
		out.write(data,1,4);//				1부터 4개
		
		out.close();
		
		
	}
}
