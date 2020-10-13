
//삽입정렬 : 선택, 버블에 비해 빠르다

package sort;
//import java.lang.*;
public class Test05_A {

	public static void main(String[] args) {
		//데이터 준비
		int data[] = new int[] {30,50,20,10,40};
		
		//파악해야 할 항목 : 현재 위치, 삽입 위치
		//비교 위치
		for(int k=0; k<data.length; k++) {
			//들어갈 위치->?
			int m=k;
			int backup=data[k];
			
			//비교 범위 : k-1부터 0까지
			for(int i=k-1;i>=0;i--) {
				if(backup<data[i]) {
					data[i+1]=data[i];	//data[i]를 오른쪽으로 한칸 이동
					m--;				//m을 왼쪽으로 한칸 이동
				}
				else {//더 이동할 수 없다면 중지
					break;
				}
			}
			data[m]=backup;
		}
		
		
		
		//출력
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}

	}

}
