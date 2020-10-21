package api.lang.integer;
//java.lang.Object;
public class Test01 {
	public static void main(String[] args) {
		Integer a = new Integer(100);
		Integer b = new Integer("100");
		
		//System.out.println(a);
		//Object에 있는 기능을 재정의
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		//a와b는 다르다
		//같다?의 의미
		//	1.같은 객체다  2.값이 같다
		System.out.println(a==b);//1번
		System.out.println(a.equals(b));//2번
		
	}
}
