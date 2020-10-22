
//필터링 프로그램

package api.lang.string;

import java.util.Scanner;

public class Test08 {
	
	public static String generate(int size) {
		String str="";
		for(int i=0; i<size; i++) {
			str+="*";
		}
		return str;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("내가 입력한 채팅 : ");
		String chat = s.nextLine();
		
		String[] filter = new String[] {"시베리아","조카","신발","십장생","주옥"};
	
		
		System.out.print("채팅창 : ");
		
		
		for(int i=0; i<filter.length; i++) {
			 chat = chat.replace(filter[i], generate(filter[i].length()));
			}
		System.out.println(chat);
	}
}
