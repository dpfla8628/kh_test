//���ǹ� 6���� ����
package java_package;

import java.util.Scanner;

public class JavaClass_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("�ο� �� : ");
		int num = scan.nextInt();
		System.out.printf("���� �Ⱓ(��) : ");
		int day = scan.nextInt();
		
		int pay1=100000*num;//���� �ޱ� �� �ݾ�(�ο���*�δ� ���)
		double pay2=0;//���� �ݾ�
		
		switch(day){
		case 12: case 1: case 2://�ܿ� 5%
			pay2 = 0.05;
			break;
		case 3: case 4: case 5://�� 30%
			pay2 = 0.3;
			break;
		case 6: case 7: case 8://���� 0%
			break;
		case 9: case 10: case 11://���� 15%
			pay2 = 0.15;
			break;
		}
		
		double pay3=(pay1-(pay1*pay2));//���� ���� �� �ݾ�
		
		System.out.println("1.���� �ޱ� �� �ݾ� : "+pay1+ "\n2.���� �ݾ� : "+(int)(pay2*100)+"%\n3.���ι��� �� �ݾ� : "+(int)pay3);
	}

}
