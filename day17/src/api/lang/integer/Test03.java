package api.lang.integer;

public class Test03 {
	public static void main(String[] args) {
		//Integer가 좋은 상황 : 제공되는 메소드 사용가능,복잡한 계산
		//30을 2진수로 변환 = 11110
		int n=30;
		String str="";
		for(int i=n; i>0; i/=2) {
			str=i%2+str;
		}
		System.out.println(str);
		
		String str2=Integer.toBinaryString(30);
		System.out.println(str2);
		
		System.out.println(Integer.toOctalString(30));//8진수
		System.out.println(Integer.toHexString(30));//16진수
		
		
	}

}
