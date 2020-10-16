package oop.static4;

public class Robot {

	public static double multi(double m1,double m2) {
		return m1*m2;
	}
	public static double multi(int m1,int m2) {
		return m1*m2;
	}//=>오버로딩! 사용자가 편하도록 double 과 int 둘 다 생성
	public static double square(int s) {
		return s*s;//=return multi(s,s);
	}
	public static double cir(int c) {
		return c*c*3.14;//=return 3.14*square(r);
		// 		   =Math.PI
	}
	public static double tri(double t1, double t2){
		return t1*t2/2.0;
	}

}
