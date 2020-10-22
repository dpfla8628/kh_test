package api.lang.stringbuffer;

public class Test02 {
	public static void main(String[] args) {
		//StringBuffer를 사용하여 덧셈
		//string+=""보다 훨씬 효율적
		
		/*StringBuffer
		 * 동기화o 잠금장치가 있다
		 * 느리다(잠금,풀림 해야되니까)
		 * 안전하다(데이터 손실o)
		 * 
		 */
		
		StringBuffer buffer = new StringBuffer();
		
		for(int i=0; i<10000; i++) {
			buffer.append("hello");
			buffer.append("\n");
		}
		System.out.println(buffer.toString());//문자열로 바꿔서 출력해라	
	}
}
