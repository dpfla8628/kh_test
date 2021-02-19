import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int aa = (a/100) + (a%100-a%10) + (a%10*100);
		int bb = (b/100) + (b%100-b%10) + (b%10*100);
		
		System.out.println((aa>bb)?aa:bb);
	}
}