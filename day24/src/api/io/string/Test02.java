package api.io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test02 {
	public static void main(String[] args) throws Exception {
		//Test01에서 살펴본 문자열을 바이트로 변경하는 특징을 활용한 파일 출력
		
		File target = new File("file","string.txt");
		FileOutputStream out = new FileOutputStream(target);
		//문자열은 바이트로 변환이 되니까 이것만 필요
		
		String text = "안녕! hello";
		
		//출력
		//out.write(text);//문자열은 출력 안됨!
		out.write(text.getBytes());//바이트 배열로 바꾸면 됨
	
	
	}

}
