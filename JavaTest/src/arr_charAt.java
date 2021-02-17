import java.util.Scanner;

public class arr_charAt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String str[] = new String[num];
		
		for(int k=0;k<num;k++) {
			str[k]=sc.next();

			int sum=0;
			int cnt=0;
			
			for(int i=0; i<str[k].length(); i++) {
				if(str[k].charAt(i)=='O') {
					cnt++;
					sum+=cnt;
				}
				else {
					cnt=0;
				}
			}
			System.out.println(sum);
		}
	}
}
