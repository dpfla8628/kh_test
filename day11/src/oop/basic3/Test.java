package oop.basic3;

public class Test {
	public static void main(String[] args) {
		
		Store data1 = new Store();
		Store data2 = new Store();
		Store data3 = new Store();
		
		data1.info("A00001","참이슬","주류",1200);
		data2.info("A00002","처음처럼","주류",1300);
		data3.info("A00003","고무장갑","생필품",2000);
		
		data1.print();
		data2.print();
		data3.print();
	}
}
