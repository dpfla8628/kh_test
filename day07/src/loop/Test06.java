//1���� 99���̿� �ִ� 5�� ��� �ִ� ���ڸ� ȭ�鿡 ���

package loop;

public class Test06 {
	
	public static void main(String[] args) {
		//999���� -> (i/100)==5 || (i%100)==5
		for(int i=1; i<100; i++) {
			if((i/10)==5 || (i%10)==5){
				System.out.println(i);
			}
		}
	}
}
