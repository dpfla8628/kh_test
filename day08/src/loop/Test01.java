
package loop;

public class Test01 {

	public static void main(String[] args) {
		
		int count=0;
/*1부터 10까지 2의 배수의 갯수	
		for(int i=1;i<=10;i++) {
			if(i%2==0) {		
				count+=1;
			}
		}System.out.println(count);
*///1부터 10까지 2의 배수의 합
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				count+=i;
			}
		}System.out.println(count);
	}

}