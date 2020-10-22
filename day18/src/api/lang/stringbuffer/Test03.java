package api.lang.stringbuffer;

public class Test03 {
	public static void main(String[] args) {
		/*StringBuilder
		 * 동기화x /잠금 장치가 없다
		 * 빠르다
		 * 불안전하다
		 */
		
		StringBuilder buffer = new StringBuilder();
		
		for(int i=0; i<10000; i++) {
			buffer.append("hello");
			buffer.append("\n");
		}
		System.out.println(buffer.toString());//문자열로 바꿔서 출력해라	
	}
}