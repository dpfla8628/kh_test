package array;
//100,200,300을 배열로 만들어 저장 후 출력
//1.5, 2.5, 3.5 배열을 만들어 저장 후 출력
public class Test02 {
	public static void main(String[] args) {
		
		int[]a = new int[3];
		double[]b = new double[3];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		System.out.println(a.length);//길이
		
		b[0]=1.5;
		b[1]=2.5;
		b[2]=3.5;
		System.out.println(b.length);
		
		for(int i=0; i<3; i++) {
		System.out.println(a[i]);}
		for(int i=0; i<3; i++) {
			System.out.println(b[i]);}
	}

}
