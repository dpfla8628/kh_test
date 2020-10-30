package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test04 {
	public static void main(String[] args) throws Exception {
		File target = new File("file","numbers.txt");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		DataInputStream data = new DataInputStream(buffer);
		
		int[] arr = new int[5];
		//데이터가 5개인걸 어떻게 알지?
		//int가 저장되어 있다는것만 알면! 파일크기/4로 계산!
		
		long count = target.length()/Integer.BYTES;//(4)
		
		for(int i=0; i<count; i++) {
			arr[i] = data.readInt();
		}
		data.close();
	
		System.out.println(Arrays.toString(arr));
	}
}
