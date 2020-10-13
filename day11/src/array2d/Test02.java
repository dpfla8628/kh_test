package array2d;

public class Test02 {
	public static void main(String[] args) {
		
		/*1.비어있는 배열 생성
		 * a[0]---[0][0][0]
		 * a[1]---[0][0][0]
		 */
		int[][] a =new int[2][3];
		
		a[1][1]=50;
		//System.out.println(a[1/*번줄*/][1/*번칸*/]);
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
