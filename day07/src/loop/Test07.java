//1���� 99���̿� �ִ� 3,6,9 ���ӿ��� �ڼ�ġ�� ���ڸ� ���Ͽ� ���

package loop;

public class Test07 {
	
	public static void main(String[] args) {
		
	for(int i=1; i<100; i++) {
		//�ڼ� �ι� ġ�� ���
		//���� �ڸ�
		boolean first = i/10==3 || i/10==6 || i/10==9;
		//���� �ڸ�
		boolean second = i%10==3 || i%10==6 || i%10==9;
		
		if(first||second) {
			if(first) {
				System.out.print("¦!");
				}
			if(second) {
				System.out.print("¦!");
				}
			System.out.println();
		}
		else {
			System.out.println(i);
		}
		
		/*���1
		boolean three = i/10==3 || i%10==3;
		boolean six  = i/10==6 || i%10==6;
		boolean nine = i/10==9 || i%10==9;
		
		if(three || six || nine){
		  	System.out.println("�ڼ�!");
		  	}
		else{
			System.out.println(i);
		}
		*/  	
		
		/*���2
		 if((i/10)==3 || (i%10)==3
		 ||(i/10)==6 || (i%10)==6
		 ||(i/10)==9 || (i%10)==9) {
			System.out.println(i);
			}
		*/
		}
	}
}
