import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=num;
		for(int i=0; i<num; i++) {
			String a = sc.next();
			for(int k=0; k<a.length();k++) {
				if(a.length()<3) {
					count+=0;
					break;
				}
				for(int j=k+2; j<a.length(); j++) {
					if(a.charAt(k)!=a.charAt(k+1) && a.charAt(k)==a.charAt(j)) {
							count--;
							k=a.length();
							break;
						}
					}	
			}
		}
		System.out.println(count);
	}
}