import java.util.Scanner;

public class while문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//존재한다면!
		while(sc.hasNextInt()) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		}
		sc.close();
	}

}
