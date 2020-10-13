package array2d;

public class Test03 {
	public static void main(String[] args) {
		
		/*2.데이터를 추가하면서 생성
		 * b[0]---[10][20][30]
		 * b[1]---[40][50][60]
		 */
		int b[][]= new int[][] {{10,20,30},{40,50,60}};
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println();
		}
		
	}

}
