package api.util.scanner;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		String str = "안녕하세요 반\n 갑 습 니 다";
		
		Scanner sc = new Scanner(str);
		
		//.hasNextLine();
		///.nextLine() : \n바로 직전까지 읽고 \n를 버리는 명령(한줄, 문장)
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

		sc.close();
	}	
	
	
}
