package sort;

public class Test03 {
	public static void main(String[] args) {
		//1. 처음부터 긑까지 범위에서 최소값 위치를 찾아낸다
		//2. 1번에서 찾은 위치와 처음을 교체한다.
		//3. 1-2번을 시작 위치 0부터 3까지 바꿔가며 실행
		
		int data[] = new int[] {30,50,20,10,40};
		for(int k=0; k<data.length;k++) {//정렬 시작 위치
			int minIndex=k;
			
			for(int i=k+1; i<data.length; i++) {
				if(data[minIndex]>data[i]) {
					minIndex=i;
					}
			}
			//System.out.println(minIndex);
				
			int temp = data[minIndex];
			data[minIndex]=data[k];
			data[k]=temp;
		}	
		for(int i=0; i<data.length; i++) {
		System.out.println(data[i]);}
	}
}
