package array;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] data = new int[] {81,77,23,33,56,49};
		data[0]=(81);
		
		int[] a=new int[] {1,2,3,4};
		
		
		//77과 56을 교환
		int temp = data[1];
		data[1]=data[4];
		data[4]=temp;
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		
	}

}
