import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String a="";
		for(int i=0; i<num; i++) {
			a+="*";
			System.out.println(a);
		}
	}
}
