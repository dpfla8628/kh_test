//Scanner
//���� : nextint() �Ǽ� : nextdouble() ���ڿ�(string) : next()
package java_package;

import java.util.Scanner;

public class JavaClass_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� �Է�:");
		String name = scan.next();
		System.out.print("���� �Է�:");
		int age = scan.nextInt();
		System.out.println("�̸�:"+name+"\n����:"+age);
		
		/* ������
		int a= scan.nextInt();
		System.out.println(a + "�� ���� ");
		for(int i=1;i<11;i++) {
		System.out.println(a+"*"+i+"="+a*i);
		*/}
	
}
