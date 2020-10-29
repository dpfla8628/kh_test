package api.io.file;

import java.io.File;

//java.io 패키지
//파일 = 글자를 모아놓은 형태의 단위
//파일의 크기 = 모아진 글자의 크기(아스키 : 1바이트 , 유니코드 : 2바이트)

//텍스트 파일 : 글자 저장이 의미가 있는 파일(.txt,.ini,.xml,.html..)
//바이너리 파일 : 글자이긴 하지만 전용 프로그램으로만 열 수 있는 파일
//(.jpg,.gif,.png,.mp3,.pdf,.ppt,.xls,.hwp)

public class Test01 {
	public static void main(String[] args) {
		
		//파일 객체 생성
		//=경로+이름
		//셋 다 같은거임
		File a = new File("file","hello.txt");
		File b = new File("file/hello.txt");
		File c = new File("file\\hello.txt");
		
		//정보 분석
		System.out.println(a.exists());//존재 하는지?
		
		System.out.println(a.getName());//이름이 뭔지?
		System.out.println(a.getName().endsWith(".txt"));//txt파일인지?
		System.out.println(a.getPath());//경로가 어떻게 되나요?(상대 경로 : 특정 지점을 기준으로 구하는 경로)
		System.out.println(a.getAbsolutePath());//절대 경로:전체경로
		System.out.println(a.length());//글자 크기 (byte)
		
		System.out.println(a.isHidden());//숨김 상태인가?
		System.out.println(a.canRead());//읽을 수 있는가?
		System.out.println(a.canWrite());//쓸 수 있는가?//읽기전용이면 false
		System.out.println(a.canExecute());//실행할 수 있는가?
		
	}
}
