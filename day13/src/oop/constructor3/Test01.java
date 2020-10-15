 package oop.constructor3;

public class Test01 {
	public static void main(String[] args) {
		Game g1=new Game("뽀로로","전사",15,300);
		Game g2=new Game("피카츄","마법사",1,0);
		//	     	   =("피카츄","마법사");
		Game g3=new Game("타요","전사",10,250);
		
		//기준이 아닌 이러한 조건은 메인에 넣어줘야한다
		if(g1.getMoney()==0) {
			System.out.println("※소지금을 양수로 입력하세요!!");
		}
		g1.print();

		g2.print();
		g3.print();
	}

}
