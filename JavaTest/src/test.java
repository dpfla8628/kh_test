import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum=a*b*c;
		int length = (int)(Math.log10(sum)+1);
		int arr[] = new int[length];
		for(int i=0; i<length; i++) {
			arr[i]=sum%10;
			sum=arr[i];
			System.out.println(sum);
		}
	}
}
