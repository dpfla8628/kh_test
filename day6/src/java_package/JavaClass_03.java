//switch문
package java_package;

public class JavaClass_03 {

	public static void main(String[] args) {
		//가위바위보 : 1(가위),2(바위),3(보)
		
		int user = 1;
		//if문은 조건 질문을 두번(1,2)하지만, switch문은 바로 조건(3)으로 이동
		switch(user) {
		case 1 ://여기서 1은 리터럴 상수이다. 
			System.out.println("가위");break;
		case 2 : System.out.println("바위");break;
		case 3 : System.out.println("보"); break;
		default : //else
			System.out.println("잘못 입력했습니다.");
		}
		/*if(user==1) {
			System.out.println("가위");
		}
		else if(user==2) {
			System.out.println("바위");
		}
		else {
			System.out.println("보");
		}*/
		

	}

}
