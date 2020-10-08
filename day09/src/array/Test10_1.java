package array;

import java.util.Scanner;

public class Test10_1 {
		public static void main(String[] args) {
			int[] num = new int[] {10, 20, 30, 40, 50};

			for (int i=1 ; i<num.length ; i++) {
				int temp = num[i];
				num[i] = num[0];
				num[0] = temp;
			}
			for (int i=0 ; i<num.length ; i++) {
				System.out.println(num[i]);
			}
		}
}
