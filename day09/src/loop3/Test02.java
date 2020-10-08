//do-while

package loop3;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;
		do {
			System.out.println("국어 점수 입력 :");
			score = scan.nextInt();
		}
		while(score<0 || score>100);
		//while(!(score>=0&&score<=100));
		System.out.println("입력된 점수 : "+score);
	}

}
