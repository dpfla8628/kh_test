package api.util.scanner;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		String str="안녕하세요 반 갑 습 니 다";
		
		//Scanner를 사용해서 문자열을 읽을 수 있다
		Scanner sc = new Scanner(str);

		//.hasNext() : 읽어올 데이터가 있는지를 파악하는 명령(t or f)
		//.next() : 공백을 기반으로 문자열을 구분해서 읽어오는 명령 -> 다 읽으면 false 출력됨
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
		//스캐너와 같이 읽기,쓰기 도구들은 사용한 뒤에 정리를 해야한다
		sc.close();
	}
}
