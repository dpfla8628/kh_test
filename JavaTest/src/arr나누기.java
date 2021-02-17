import java.util.Scanner;

public class arr나누기
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt() * s.nextInt() * s.nextInt();
		int[] num = new int[10];
		
		while(n > 0){
		   num[n % 10]++;
		   n /= 10;
		}
		
		for(int i : num){
		    System.out.println(i);
		}
	}
}