//1���� 99���̿� �ִ� 3,6,9 ���ӿ��� �ڼ�ġ�� ���ڸ� ���Ͽ� ���

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
