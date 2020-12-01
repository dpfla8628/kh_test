package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(y-45>0){
			System.out.println(x+" "+(y-45));
		}
		else {
			if(x==0) {
				x=24;
			}
			System.out.println((x-1)+" "+(y-45+60));
		}
	}
}
