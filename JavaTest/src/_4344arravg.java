import java.util.*;

public class _4344arravg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int num2=sc.nextInt();
			int arr[] = new int[num2];
			int sum=0;
			for(int j=0; j<num2; j++) {
				arr[j] = sc.nextInt();
				sum+=arr[j];
			}
			int count=0;
			for(int j=0; j<num2; j++) {
			if(arr[j]>sum/num2) {
				count++;
				}
			}
			float a = (float)count/(float)num2*100;
			System.out.printf("%.3f%%\n",a);
		}
	}
}
