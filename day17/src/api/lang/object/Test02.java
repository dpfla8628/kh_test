package api.lang.object;
//import java.lang*;
public class Test02 {
	public static void main(String[] args) {
		//Object는 모든 클래스의 조상
		//=Object에는 아무거나 넣을 수 있다 = 업캐스팅
		
		//=int a = 10;
		Object a = 10;
		Object b = "hello";
		Object c =3.14;
		Object d =new int[5];
				
		//형태 검사
		System.out.println(a instanceof String);
		//false , a는 int이다
	}
}
