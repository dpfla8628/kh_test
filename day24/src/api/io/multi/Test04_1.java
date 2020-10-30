package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test04_1 {
	public static void main(String[] args) throws Exception {
		File target = new File("file","numbers.txt");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		DataInputStream data = new DataInputStream(buffer);
		
		//데이터의 크기 모를 경우
		List<Integer> list = new ArrayList<>();
		
		long count = target.length()/Integer.BYTES;//(4)
		
		//예외 생김
		try {
			while(true) {
				int n = data.readInt();
				list.add(n);
			}
		}
		catch(Exception e) {
			
		}
		
		data.close();
	
		System.out.println(list);
	}
}
