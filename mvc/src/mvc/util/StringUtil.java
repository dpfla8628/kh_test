package mvc.util;

import java.util.Random;

public class StringUtil {

	public static String generateRandomString(int size) {
	//랜덤 문자열 생성
	String baseString = "abcdefghigklmnopqrstuvwzynz1234567890";
	StringBuffer buffer = new StringBuffer();
	Random r = new Random();
	for(int i=0; i<size; i++) {
		int index = r.nextInt(baseString.length());
		buffer.append(baseString.charAt(index));
		}
	String str = buffer.toString();
	return str;
	}
}
