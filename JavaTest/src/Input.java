import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {
	public static void main(String[] args)   {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int max = sc.nextInt();
	int a[] = new int[num];
	
	for(int i=0; i<num; i++) {
		a[i]=sc.nextInt();
		if(a[i]<max) {
			System.out.println(a[i]);
		}
	}
	}	
}

