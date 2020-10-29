package api.io.file;

import java.io.File;

public class Test05 {
	public static void main(String[] args) {
		//디렉터리 검색
		//디렉터리는 크기가 없고 크기는 안에 있는 파일의 크기
		File dir =new File("file");
		System.out.println(dir.isDirectory());
		
		//file 폴더에 있는 모든 파일을 불러오고 싶어요
		//안에 들어있는 파일의 개수는 모른다
		File[] files = dir.listFiles();
		System.out.println(files.length);
		
		for(File f : files) {
			System.out.println(f.getPath());
		}
	}
}
