package opp.constructor3;

public class Test01 {
	public static void main(String[] args) {
		Game g1=new Game("뽀로로","전사",15,300);
		Game g2=new Game("피카츄","마법사",1,0);
		Game g3=new Game("타요","전사",10,250);
		
		g1.print();
		g2.print();
		g3.print();
	}

}
