package array;


public class Test04 {
	public static void main(String[] args) {
		
		//배열 선언과 동시에 값 설정
		String a[] = new String[] {"자바","파이썬","루비","자바스크립트"};
		/*or String[] = new String[4]
		 * 		a[0]="자바";
		 */
		
		//크기가 정해지지 않은 경우를 대비!
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
