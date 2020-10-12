/*
 * [10,20,30,40,50]이 저장된 배열을 만들고 위치를 변경
 * 1.배열의 모든 데이터를 뒤집에서 출력(위치를 반대로 변경해서 출력)*출력을 거꾸로가 아님
 * 2.배열의 데이터 개수가 바뀌어도 뒤집어서 출력이 가능하도록 
 * 자동 계산된 길이를 활용하여 반복문 구현
 */
package array;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		int[] data = new int[] {10,20,30,40,50};
		
		for(int i=0 ; i<data.length/2; i++) {	//양 끝에 있는 값을 교환하는 것이기 때문에 중간까지만 바꿔줘도 무방
			int temp = data[i];
			data[i]=data[data.length-(i+1)];	//양쪽 값 교환
			data[data.length-(i+1)]=temp;
		}
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}		
	}
}
