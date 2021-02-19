import java.util.Scanner;

public class _1065HanNumber {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count=0;
			if(a<99) {
				System.out.println(a);
			}
			else{
				int result=99;
				for(int i=100; i<=a; i++) {
					result+=han(i);	
				}
				if(a==1000) {
					result--;
				}
				System.out.println(result);
		}
	}
 
 
	public static int han(int number){
		int num1 = number/100%10;
		int num2 = number/10%10;
		int num3 = number%10;
		if(num1+num3==num2*2) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
}  