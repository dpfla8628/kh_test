//switch�� test
package java_package;

public class JavaClass_04 {

	public static void main(String[] args) {
		
		int month = 1;
		/*�޿� ���� �ϼ�
		switch(month) {
		case 1 : case 3 :case 5 :case 7 :case 8 :case 10 : case 12 :
			System.out.println("31��"); break;
		case 2 : System.out.println("29��"); break;
		case 4 : case 6: case 9 : case 11:
			System.out.println("30��"); break;
		}*/
		/*�޿� ���� ���� 1
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		case 12: case 1: case 12:
			System.out.println("�ܿ�");
			break;
		}*/
		/*�޿� ���� ���� 2
		switch(month/3) {
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		case 0: case 4: //default:
			System.out.println("�ܿ�");
			break;
		}*/

	}

}
