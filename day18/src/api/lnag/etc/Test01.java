package api.lnag.etc;

public class Test01 {
	public static void main(String[] args) {
		//java.lang.Math 클래스
		//생성자가 없는 클래스!!
		//인스턴스(객체) 생성이 불가능
		
		//abs() 절대값
		int a = 50;
		int b = 70;
		System.out.println(Math.abs(b-a));
		
		//round() 반올림
		double c = 1.5;
		System.out.println(Math.round(c));
		
		//random() 무작위 실수
		double d = Math.random();
		System.out.println(d);
		
		//pow() : 거듭제곱
		System.out.println(2^10);//xor
		System.out.println(Math.pow(2, 10));
			
		//PI : 원주율
		System.out.println(Math.PI);
	}
}
