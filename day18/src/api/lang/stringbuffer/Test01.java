package api.lang.stringbuffer;

//StringBuffer : 문자열 합성기
public class Test01 {
	public static void main(String[] args) {
		//String의 문제점 : 덧셈의 경우.. 매우 오래 걸린다
		String str="";
		
		long a = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			str+="hello";
			str+="\n";	
		}
		long b = System.currentTimeMillis();
		System.out.println(b-a+"ms");//소요시간/ms:1000분의1초
		
		
		//System.out.println(str);
	}

}
