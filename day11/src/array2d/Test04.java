package array2d;

public class Test04 {
	public static void main(String[] args) {
		
		int num[][] = new int[5][5];
		
		/*들어가는 숫자를 기준으로 반복
		int x=0, y=0;
		for(int i=1; i<=25; i++) {
			data[x][y] = i;
			
			y++;//오른쪽
			으로 이동
			if(y>=5) {//벗어나려고 하면
				//다음줄 첫번째 칸으로 이동시켜라!
				y=0;
				x++;
			}
		}*/
		
		int k=1;
		
		for(int i=0; i<num.length;i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j]=k++;
				System.out.print(num[i
				                     ][j]+"\t");
			}
			System.out.println();
		}
	}

}
