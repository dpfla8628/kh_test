
//선택 정렬

package sort;

public class Test03 {
	public static void main(String[] args) {
		//1. 처음부터 끝까지 범위에서 최소값 위치를 찾아낸다
		//2. 1번에서 찾은 위치와 처음을 교체한다.
		//3. 1-2번을 시작 위치 0부터 3까지 바꿔가며 실행
		
		int data[] = new int[] {30,50,20,10,40};
		
		for(int k=0; k<data.length;k++) {			//비교 범위를 줄여나가기 위해 설정
			int minIndex=k;							//비교 범위가 줄어듦에 따라 최소 인덱스가 바뀐다(+1)
			
			for(int i=k+1; i<data.length; i++) {	//최소값 인덱스를 찾는다
				if(data[minIndex]>data[i]) {
					minIndex=i;
					}
			}
			//System.out.println(minIndex);
		//스왑에 조건문이 없기 때문에 모든 상황에서 걸리는 시간이 같음
			int temp = data[minIndex];				//비교 대상과 최소값 데이터를 바꿔준다
			data[minIndex]=data[k];
			data[k]=temp;
		}	
		for(int i=0; i<data.length; i++) {
		System.out.println(data[i]);}
	}
}
