import java.util.*;
public class charAt_0 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		String a=s.next();
		int sum=0;
		for (int i=0;i<n;i++) {
			sum+=a.charAt(i)-'0';//문자형을 정수로
		}
		System.out.print(sum);
	}
}
//charAt(i)-'0' : 문자->숫자
//charAt(i)-'a' : 숫자->문자