//������_�ǽ�����
package java_package;

import java.util.Scanner;

public class Test_Q_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
/*1��)  Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, 
                ����� �ƴϸ� ������� �ƴϴ١��� ���
 
		System.out.printf("���� : ");
		int a = scan.nextInt();
		System.out.println(a>0?"�����":"����� �ƴϴ�");
		/* if��
		   if(a>0){
		   		System.out.println("�����");
		   		}
		   	else{
		   		System.out.println("����� �ƴϴ�");
		   		}
		   	System.out.println("���α׷� ��");
*/
		
/*2��) Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�,
              ����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ���
              
		System.out.printf("���� : ");
		int a = scan.nextInt();
		System.out.println((a>0)?"�����":(a==0)?"0�̴�":"������");
*/
		
/*3��) Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, 
              ¦���� �ƴϸ� ��Ȧ���١��� ��� 
              
		System.out.print("���� : ");
		int a = scan.nextInt();
		
		if (a%2==0) {
			System.out.println("¦����");
			}
		else {
			System.out.println("Ȧ����");
		}
*/
		
/*4��) �ο� ���� ���� ������ Ű����� �Է� �ް�
	  1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ���
	  
		System.out.printf("�ο� �� : ");
		int a = scan.nextInt();
		if(a>0) {
			System.out.printf("���� ���� : ");
			int b=scan.nextInt();
			
			System.out.println("1�δ� ���� ���� : "+(b/a));
			System.out.println("���� ���� ���� : "+(b%a));}
		else {
			System.out.println("0���� ���� �� ����");
		}
*/

/*5��)  Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ���
  		�� �� ������ ��M���̸� ���л�, ��M���� �ƴϸ� ���л����� ���
  		
		System.out.printf("�̸� : ");
		String name = scan.next();
		System.out.printf("�г�(���ڸ�) : ");
		int grade = scan.nextInt();
		System.out.printf("��(���ڸ�) : ");
		int clas = scan.nextInt();
		System.out.printf("��ȣ(���ڸ�) : ");
		int num = scan.nextInt();
		System.out.printf("����(M/F) : ");
		String sex = scan.next();
			if(sex.equals("m")||sex.equals("M")){
				sex="��";}
			else if(sex.equals("f")||sex.equals("F")){
				sex="��";}
			//OR char sex=='M'�� �� sout->���л�,�ƴ϶�� sout->���л�
		System.out.printf("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		Double score = scan.nextDouble();
		
		System.out.println(grade+"�г� "+clas+"�� "+num+"�� "+name+" "+sex+"�л��� ������ "+score+"�̴�.");
*/	
		
/*6��) ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
		����(19�� �ʰ�)���� ���
		
		System.out.printf("���� : ");
		int age = scan.nextInt();
		
		if(age<=13) {
			System.out.println("���");}
		else if(age>13 && age<=19) {
			System.out.println("û�ҳ�");}
		else {
			System.out.println("����");
		}
*/
		
/*7��) ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
	     �� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
	     �� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ���
	     
		System.out.printf("���� : ");
		int kor = scan.nextInt();
		System.out.printf("���� : ");
		int eng = scan.nextInt();
		System.out.printf("���� : ");
		int math = scan.nextInt();
		
		double avg=((kor+eng+math)/3);
		int sum=(kor+eng+math);
				
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
		
		if(kor>=40&&eng>=40&&math>=40&&avg>=60) {
			System.out.println("�հ�");}
		else {
			System.out.println("���հ�");}
*/
	
/*8��) �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ���
 * 
		System.out.printf("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		String num = scan.next();
		if(num.charAt(8)==2) {
			System.out.println("����");}
		else {
			System.out.println("����");}
*/
	
/*9��) Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
		�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
		�ƴϸ� false�� ����ϼ���.
		(��, num1�� num2���� �۾ƾ� ��)
		
		System.out.printf("����1 : ");
		int num1 = scan.nextInt();
		System.out.printf("����2 : ");
		int num2 = scan.nextInt();
		if(num1>num2) {
			System.out.println("����1�� ����2���� �۾ƾ� ��");
		}
		else {
		System.out.printf("�Է� : ");
		int check = scan.nextInt();
		
		if(check<=num1||check>num2) {
			System.out.println("true");}
		else {
			System.out.println("false");}
		}
*/	
		
/*10��) 3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, 
  	        �ƴϸ� false�� ���
		
		System.out.print("�Է�1 : ");
		int num1 = scan.nextInt();
		System.out.print("�Է�2 : ");
		int num2 = scan.nextInt();
		System.out.print("�Է�3 : ");
		int num3 = scan.nextInt();
		
		if(num1==num2&&num2==num3) {
			System.out.println("true");}
		else {
			System.out.println("false");}
*/		
		
/*11��)	A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
		�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, �̸��̸� ��3000 �̸����� ����ϼ���.
		(A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)	
		
		System.out.print("A����� ���� : ");
		int a_sal = scan.nextInt();
		System.out.print("B����� ���� : ");
		int b_sal = scan.nextInt();
		System.out.print("C����� ���� : ");
		int c_sal = scan.nextInt();
		
		double a_plus = a_sal+(a_sal*0.4);
		double b_plus = b_sal;
		double c_plus = c_sal+(c_sal*0.15);
		
		System.out.println("A��� ����/����+a : "+a_sal+"/"+a_plus);
		if(a_plus>=3000) {
			System.out.println("3000 �̻�");}
		else {
			System.out.println("3000 �̸�");}
		System.out.println("B��� ����/����+a : "+b_sal+"/"+b_plus);
		if(b_plus>=3000) {
			System.out.println("3000 �̻�");}
		else {
			System.out.println("3000 �̸�");}
		System.out.println("C��� ����/����+a : "+c_sal+"/"+c_plus);
		if(c_plus>=3000) {
			System.out.println("3000 �̻�");}
		else {
			System.out.println("3000 �̸�");}
*/
		
	}
}
