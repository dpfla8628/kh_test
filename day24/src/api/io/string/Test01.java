package api.io.string;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		//문자열 입출력
		//문자열도 객체이지만 특별하게 취급되는 이유가 있다
		//문자열은 byte[]와 호환 가능 : .getBytes()사용 가능
		
		String hello = "안녕! hello!";
		byte[] data = hello.getBytes();//String->byte[]
		
		System.out.println(hello);
		System.out.println(Arrays.toString(data));

		String recover = new String(data);//byte[]->String
		System.out.println(recover);
	}

}
