package api.lang.etc;

import java.io.IOException;

public class Exception_Test03 {
	public static void main(String[] args) throws IOException {
	
		//java.lang.Runtime 클래스
		//생성자 없음
		//만든 사람이 원하는 방식으로 생성이 되게 유도하는 것
		//생성 명령이 존재한다(static)
		
		Runtime run = Runtime.getRuntime();
		
		//exec() : 외부 명령을 실행
		//run.exec("notepad.exe");	
		//run.exec("calc.exe");
		run.exec("cmd /c start http://www.google.com");
		
	}
}
