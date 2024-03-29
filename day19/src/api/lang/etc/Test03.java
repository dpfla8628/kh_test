package api.lang.etc;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
	
		//java.lang.Runtime 클래스
		//생성자 없음
		//만든 사람이 원하는 방식으로 생성이 되게 유도하는 것
		//생성 명령이 존재한다(static)
		
		Runtime run = Runtime.getRuntime();
		
		try {
			run.exec("notepad.exe");
			run.exec("calc.exe");
			run.exec("cmd /c start http://www.naver.com");
		}
		catch(Exception e) {
			System.err.println("명령이 원활하게 실행되지 않았습니다");
			e.printStackTrace();
		}		
	}
}
