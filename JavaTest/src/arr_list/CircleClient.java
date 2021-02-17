package arr_list;

import java.util.ArrayList;

public class CircleClient {
	public static void main(String[] args) {
		
		//배열
		Circle[] cArr = new Circle[5];
		
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = new Circle(i);
		}
		for(Circle c : cArr) {
			System.out.println(c.getRadius());
		}
		for(int i=0; i<cArr.length; i++) {
			System.out.println(cArr[i].getArea());
		}
		
		//리스트
		ArrayList<Circle> cList = new ArrayList<>();
		for(int i=0; i<5; i++) {
			cList.add(new Circle(i));
		}
		System.out.println(cList.get(0).getRadius());
		System.out.println(cList.get(4).getRadius());
		
		for(Circle c : cList) {
			System.out.println(c.getArea());
		}
		
		//리스트를 배열로
		Circle[] cArr2 = new Circle[cList.size()];
		cList.toArray(cArr2);
		
		for(Circle c : cArr2) {
			System.out.println(c.getArea());
		}
	}
}
