/* 
 * [10,20,30,40,50]이 저장된 배열을 만들고 위치를 변경
 * 1.배열을 오른쪽으로 1칸 회전시켜 출력하시오(50,10,20,30,40)
 * 2.사용자가 입력한 칸 수만큼 배열을 오른쪽으로 이동
 */
package array;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("회전시킬 칸 수 입력 : ");
		int num = scan.nextInt();
		
		int data[] = new int[] {10,20,30,40,50};
		int move[] = new int[data.length];
		
		for(int j=0; j<num; j++){					//입력 받은 수만큼 반복
			for(int i=0 ; i<data.length-1; i++) {
				move[i+1] = data[i];				//move배열 안에 data배열을 한 칸씩 미뤄서 넣어준다
			}
			move[0]=data[data.length-1];			//마지막에 있는 값은 맨 앞에 넣어준다
			for(int i=0; i<data.length;i++) {
				data[i]=move[i];					//반복을 위해  배열을 다시 data배열 안에 넣어준다
			}
		}
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}
}