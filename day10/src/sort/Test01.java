
//정렬 : 데이터를 순차적으로 배치하는 과정
//오름차순(asc), 내림차순(des);

/*1.선택 정렬(selection sort) : 단순 / 느림
 * 전체에서 최소값을 찾아 앞부터 채운다
 * 최소값을 찾는 방법을 알아야 한다
 */
package sort;

public class Test01 {

	public static void main(String[] args) {
		int data[] = new int[] {3,5,2,1,4};
		//최소값을 알기 위한 변수 준비
		int minValue=data[0];
		//최소값의 위치를 알기 위한 변수 준비
		int minIndex=0;

		for(int i=1; i<data.length;i++) {
			if(minValue>data[i]) {
				minValue=data[i];
				minIndex=i;
			}
		}
		System.out.println("배열의 최소값 : "+minValue);

	}

}
