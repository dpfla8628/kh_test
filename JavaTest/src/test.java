import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a [] = new int[9];
		int max=a[0];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			if(a[i]>max) {
				max=a[i];
			}
		}
			System.out.println(max);
	}
}
