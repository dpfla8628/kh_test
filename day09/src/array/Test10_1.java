package array;
/*4번 데이터 빼고		int temp=data[4];
 * 3번을 4번으로		data[4]=data[3];	규칙화[
 * 2번을 3번으로		data[3]=data[2];		
 * 1번을 2번으로		data[2]=data[1];
 * 0번은 1번으로		data[1]=data[0];		]
 * 빼둔 데이터를 0번으로	data[0]=temp;
 */
import java.util.Scanner;

public class Test10_1 {
		public static void main(String[] args) {
			int[] data = new int[] {10, 20, 30, 40, 50};
			Scanner scan = new Scanner(System.in);
			System.out.print("회전시킬 칸 수 입력 : ");
			int num = scan.nextInt();

			int len = data.length;				//배열 길이
			
			for(int k=0; k<num; k++) {			//원하는 숫자 만큼 이동하기
				
				int temp = data[len-1];			//맨 끝 값을 temp에 넣어준다
				
				for (int i=len-1 ; i>=1 ; i--) {
					//System.out.println(i+"번 위치에 "+(i-1)+"번 데이터 복사");
					data[i]=data[i-1];			//왼쪽 값을 오른쪽으로 옮겨준다
				}
				data[0]=temp;					//첫번째 값은 맨 마지막 값
					
			}
			
			for (int i=0 ; i<data.length ; i++) {
				System.out.println(data[i]);
			}
		}
}
