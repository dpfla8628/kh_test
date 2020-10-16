package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		//뽀로로 인스턴스 1개 생성
		Pororo p = new Pororo(null);
		p.hello();//상속 받은 기능(재정의 됨)
		p.nag();//교유 기능
		
		Tayo t =new Tayo(null);
		t.hello();
		t.drive();
		

	}
}
