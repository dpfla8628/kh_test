package api.util.scanner;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		String str="110 75 999 56789";
		
		Scanner sc = new Scanner(str);

		//nextInt() : next()로 읽은 데이터를 정수로 바꿔서 반환하는 명령이다
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			System.out.println(n);
		}
		
		//스캐너와 같이 읽기,쓰기 도구들은 사용한 뒤에 정리를 해야한다
		sc.close();
	}
}
