import java.util.Arrays;
import java.util.Scanner;

//재귀함수 팩토리얼

public class _10872_Factorial_recursive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		System.out.println(func(a));
	}
	public static int func(int b) {
		
		if(b<=1) return 1;
		return b*func(b-1);
	}
}