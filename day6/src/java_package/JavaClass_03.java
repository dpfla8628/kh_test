//switch��
package java_package;

public class JavaClass_03 {

	public static void main(String[] args) {
		//���������� : 1(����),2(����),3(��)
		
		int user = 1;
		//if���� ���� ������ �ι�(1,2)������, switch���� �ٷ� ����(3)���� �̵�
		switch(user) {
		case 1 ://���⼭ 1�� ���ͷ� ����̴�. 
			System.out.println("����");break;
		case 2 : System.out.println("����");break;
		case 3 : System.out.println("��"); break;
		default : //else
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		/*if(user==1) {
			System.out.println("����");
		}
		else if(user==2) {
			System.out.println("����");
		}
		else {
			System.out.println("��");
		}*/
		

	}

}
