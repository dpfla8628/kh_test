
//버블정렬

package sort;

public class Test04 {

	public static void main(String[] args) {
		
		int[] data = new int[] {30,50,20,10,40};
		//오름차순 정렬
		
		//비교 범위를 줄여나간다
		for(int k=data.length-1; k>0; k--) {
		//오름차순이니까 스왑 스왑하면 맨 오른쪽에 가장 큰 수가 위치한다.	
			for(int i=0;i<k;i++) {
				if(data[i]>data[i+1])
				{
					int temp = data[i];
					data[i]=data[i+1];
					data[i+1]=temp;
				}
			}
		}
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
