//1부터 99사이에 있는 3,6,9 게임에서 박수치는 숫자를 구하여 출력

package loop;

public class Test07 {
	
	public static void main(String[] args) {
		
	for(int i=1; i<100; i++) {
		if((int)(i/10)==3 || (i%10)==3
		 ||(int)(i/10)==6 || (i%10)==6
		 ||(int)(i/10)==9 || (i%10)==9) {
			System.out.println(i);
			}
		}
	}
}
