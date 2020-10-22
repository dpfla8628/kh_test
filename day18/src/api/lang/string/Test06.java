
//3글자 끝말잇기 프로그램!!!

package api.lang.string;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		String word1 = "바나나";
		
		while(true) {
			System.out.print("\""+word1.substring(2)+"\"로 시작하는 세글자 단어를 입력하세요 : ");
			
			String word2 = a.next();
		if(word2.length()==3 && word2.substring(0,1).equals(word1.substring(2))) {
			System.out.println("성공!"+word1+"-"+word2);
			break;
			}
		else {
			System.out.println("잘못 입력했습니다 다시 입력하세요!");}
		}
	}
}
