
//Test10 
//하루에 7700원씩 1년동안 모으면 얼마인지 구해서 출력하세요

package loop;

public class Test02 {

	public static void main(String[] args) {

		int money=0;
		
		for(int i=1;i<=365;i++) {
			money+=7700;
		}
		System.out.println(money);
		
	}

}
