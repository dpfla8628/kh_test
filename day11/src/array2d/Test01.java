package array2d;

public class Test01 {
	public static void main(String[] args) {
		//변수 6개 = 1차원배열 2개  = 2차원 배열 1개
		int a[]= new int[] {50,60,70};
		int b[] = new int[] {65,75,85};
		//=>뭐든지 두번씩 해야하기 때문에 비효율적이다!
		
		int c[][]=new int[2][3];
		c[0]=a;
		c[1]=b;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<c[i].length;j++) {
				System.out.println(c[i][j]);
			}
		}
		
	}

}
