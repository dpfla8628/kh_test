package oop.final2;

public class Test01 {
	public static void main(String[] args) {
		Data d1 = new Data("master","1234","운영자");
		Data d2 = new Data("user","5555");
		
		//d1.setId("~~");=>final으로 설정했기 때문에 불가능
		d1.setPass("4567");
		
		d1.print();
		d2.print();
	}

}
