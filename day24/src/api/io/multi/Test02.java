package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Test02 {
	public static void main(String[] args) throws Exception {
		
		File target = new File("file","multi.txt");
		FileInputStream  in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in/*8192*/);
		DataInputStream data = new DataInputStream(buffer);
		
		//[프로그램]<- data<- buffet<- in<-target<-[multi.txt]
		//data를 이용하여 입력을 진행
		//읽어들여서 조립(복원)하는 것도 형태마다 다름
		//반드시 출력된 순서대로 입력!!!
		int a = data.readInt();
		char b =data.readChar();
		double c =data.readDouble();
		long d =data.readLong();
		byte e =data.readByte();
		float f =data.readFloat();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
