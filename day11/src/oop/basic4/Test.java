package oop.basic4;

import oop.basic3.Store;

public class Test {
	public static void main(String[] args) {
		Coffee data1 = new Coffee();
		Coffee data2 = new Coffee();
		Coffee data3 = new Coffee();
		
		data1.info("아메리카노","음료",1500,false);
		data2.info("카페라떼","음료",2000,true);
		data3.info("샌드위치","식사",3000,true);
		
		
		data1.print();
		data2.print();
		data3.print();
	}
}
