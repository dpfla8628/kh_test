
//홀수 출력

package loop;

public class Test04 {

	public static void main(String[] args) {
		/*성능은 더 좋다
		for(int i=1; i<11; i+=2) {
			System.out.println(i);
		}
		*/
		//사용자가 사용하기 더 편함
		for(int i=1; i<11;i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
	}

}