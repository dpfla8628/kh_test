package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Test06 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("file","hello.txt");
		File f2 = new File("file","copy.txt");
		
		FileInputStream in = new FileInputStream(f1); 
		FileOutputStream out = new FileOutputStream(f2);
	
		//배열의 크기가 클 수록 빨라짐
		//그렇다고해서 너무 커도 느려지기 때문에 적당한 값을 지정해주자
		//버퍼가 너무 크면? 오버헤드 생김
		//컴퓨터는 물리적으로 2진수로 표현되기 때문에 2의 제곱수로 정하자
		//1,2,4,8,16,32....
		//잘 모를 때는 1024정도로 하면 효율적임
		
		//결론 => 버퍼는 쓰는게 좋다 , 적당한 크기가 좋다
		byte[]data = new byte[4];
		
		long total = f1.length();//총 옮길 크기
		long acc=0L;//실제 옮긴 크기
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int size = in.read(data);
			if(size==-1)break;
			out.write(data,0,size);
		
			acc+=size;//옮긴 개수 누적
			double percent = acc * 100.0 / total;
			System.out.println(acc+"/"+total+"("+percent);
		
		}
		long finish = System.currentTimeMillis() ;
		long time = finish - start;
		System.out.println("시간"+time);
		
		in.close();
		out.close();
	}
}
