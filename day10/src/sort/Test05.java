
//삽입정렬

package sort;

public class Test05 {
	public static void main(String[] args) {
	
		int data[] = new int[] {30,50,20,10,40,90,11,44,22,77};
		
		for(int i=1; i<data.length; i++) {
				int key=data[i];
				for(int j=i-1; j>=0; j--) {
						if(key<data[j]) {
							data[j+1]=data[j];
							data[j]=key;
						}	
				}
		}
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
