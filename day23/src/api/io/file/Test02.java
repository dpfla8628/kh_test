package api.io.file;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Test02 {
	public static void main(String[] args) {
		File a = new File("file/hello.txt");
		File b = new File("file/hello2.txt");	
		
		if(!a.exists() || !b.exists()) {
			System.err.println("파일이 없습니다");
			System.exit(-1);//운영체제에게 전달할 상태메세지 : 일반적으로 0 아니면 다 비정상 종료
		}
		
		//파일 이름
		System.out.println(a.getName());
		System.out.println(b.getName());
		//파일 경로
		System.out.println(a.getPath());
		System.out.println(b.getPath());
		//크기가 큰 파일 이름 출력
		if(a.length()>b.length()) {
			System.out.println(a.getName());
		}
		else if(a.length()<b.length()){
			System.out.println(b.getName());
		}
		else {
			System.out.println("두 파일은 크기가 같습니다");
		}
		
		//최신 파일의 이름
		if(a.lastModified()>b.lastModified()) {
			System.out.println(a.getName());
		}
		else if(a.lastModified()<b.lastModified()){
			System.out.println(b.getName());
		}
		else {
			System.out.println("수정 시각이 같습니다");
		}
		//Date와 SimpleDateFormat을 이용하여 원하는 형식으로
		Date d = new Date(a.lastModified());
		SimpleDateFormat f =new SimpleDateFormat("y년M월d일E요일 h시 m분 s초");
		System.out.println(f.format(d));
		
	}

}
