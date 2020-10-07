
//1부터 99사이에 있는 3,6,9 게임에서 박수치는 숫자를 구하여 출력

package loop;

public class Test07 {
	
	public static void main(String[] args) {
		
	for(int i=1; i<100; i++) {
		//박수 두번 치는 경우!
		//십의 자리
		boolean first = i/10==3 || i/10==6 || i/10==9;
		//일의 자리
		boolean second = i%10==3 || i%10==6 || i%10==9;
		
		if(first||second) {
			if(first) {
				System.out.print("짝!");
				}
			if(second) {
				System.out.print("짝!");
				}
			System.out.println();
		}
		else {
			System.out.println(i);
		}
		
		/*방법1
		boolean three = i/10==3 || i%10==3;
		boolean six  = i/10==6 || i%10==6;
		boolean nine = i/10==9 || i%10==9;
		
		if(three || six || nine){
		  	System.out.println("박수!");
		  	}
		else{
			System.out.println(i);
		}
		*/  	
		
		/*방법2
		 if((i/10)==3 || (i%10)==3
		 ||(i/10)==6 || (i%10)==6
		 ||(i/10)==9 || (i%10)==9) {
			System.out.println(i);
			}
		*/
		}
	}
}