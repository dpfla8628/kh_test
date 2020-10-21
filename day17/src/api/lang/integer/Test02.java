package api.lang.integer;

public class Test02 {
	public static void main(String[] args) {
	
		//Integer같은 클래스를 Wrapper 클래스라 부른다(=하이브리드 자료형)
		//하이브리드 자료형(Wrapper class) : 서로 호환 가능
		/*boolean	Boolean
		 * int		Integer
		 * byte		Bute
		 * short	Short
		 * char		Char
		 * long		Long
		 * float	Float
		 * double 	Double
		 */
		
		//int와 Integer은 호환 가능
		Integer v1 = 10;//int가 Integer로 보관(값이 포장됨)
		int v2 = new Integer(10);//Integer가 int로 보관(값의 포장이 벗겨짐)
		
		
		//int가 좋은 상황 : 단순 작업
		//int로 합계 구하기(원시형)
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		//Integer으로 합계 구하기(참조형)
		Integer d = new Integer(10);
		Integer e = new Integer(20);
		Integer f = Integer.sum(d,e);
		System.out.println(f.toString());
		

	}
}
