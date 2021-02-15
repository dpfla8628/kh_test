import java.util.Scanner;

public class Scanner_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Case #"+(i+1)+": "+num1+" + "+num2+" = "+(num1+num2));
		}
	}
}
