package api.io.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.next();
		File f = new File(k);
		sc.close();
		
		if(f.exists()) {
		
		//경로가 디렉터리면 내부 목록(파일/폴더)출력
		if(f.isDirectory()==true) {
			File[] files = f.listFiles();
			for(File a : files) {
				System.out.println(a.getPath());
				}
			}
		//경로가 파일이라면 (파일명/크기/최종수정시각)출력
		if(f.isFile()==true) {
			System.out.println(f.getName());
			System.out.println(f.length());//long
			
			Date d = new Date(f.lastModified());
			SimpleDateFormat s = new SimpleDateFormat("y년M월d일E요일 h시m분s초");
			System.out.println(s.format(d));
			}
		}
		else {
			System.out.println("존재하지않습니다");
		}
	}

}
