
/*Test11
한달(30일)동안 다음과 같이 푸시업 운동을 합니다

1일차 : 10개
2일차 : 1일차 개수 + 3개
3일차 : 2일차 개수 + 3개
이하 동일
한달동안 한 푸시업 개수를 구하세요
*/

package loop;

public class Test03 {

	public static void main(String[] args) {
		
		int push=10;
		int sum=0;
		
		for(int i=0; i<30; i++) {
			sum+=push;
			push+=3;
			
		}
		System.out.println(sum);

	}

}