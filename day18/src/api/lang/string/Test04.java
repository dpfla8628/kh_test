package api.lang.string;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//=for(;;)
		while(true) {
		System.out.println("닉네임 입력 : ");
		String id = s.next();
		
		//조건 변수를 따로 만들어줘도 됨
		//boolean lengthOk = nickname.length()>=2 && nickname.length()<=6;
		//boolean adminOk = !nickname.contaons("운영자");
		//if (lengthOk && adminOk)
		
		if(id.length()<2||id.length()>6||id.contains("운영자")) {
				System.out.println("다시 입력하세요");
			}
		else {
			System.out.println("닉네임 생성 완료!");
			break;
			}
		}
	}
}
