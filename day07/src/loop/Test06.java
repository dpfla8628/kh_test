
//1부터 99사이에 있는 5가 들어 있는 숫자를 화면에 출력

package loop;

public class Test06 {
	
	public static void main(String[] args) {
		//999까지 -> (i/100)==5 || (i%100)==5
		for(int i=1; i<100; i++) {
			if((i/10)==5 || (i%10)==5){
				System.out.println(i);
			}
		}
	}
}