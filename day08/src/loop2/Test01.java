package loop2;

public class Test01 {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		
		// while 구문
		int n=1;					//선언부(외부)
		while(n<10) {               //조건부
			System.out.println(n);  
			n++;      				//중감부(내부)
		}//무한반복 ->(true)

	}

}
