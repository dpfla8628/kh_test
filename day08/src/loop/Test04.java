
/* ##Test12
 * 30일동안 받을 총 금액
 * 첫째날은 1원, 둘째날 부터는 2배
 */

package loop;

public class Test04 {

	public static void main(String[] args) {
		
		long money=1L;
		long total = 0L;
		
		for(int i=0; i<40; i++) {
			total+=money;
			money*=2;
		}
		System.out.println(total);

	}

}
