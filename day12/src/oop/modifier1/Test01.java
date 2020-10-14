package oop.modifier1;

public class Test01 {

	public static void main(String[] args) {
		Bag b1 = new Bag();
		
		//정보 설정시 setter메소드를 쓰드록 하는 것이 좋다! 권장사항
		//b1.name="~~~"; 대신 b1.setName("~~~")을 쓰기 위해
		//Bag에서 private로 전환
		b1.setName("구찌");
		
		b1.print();
	
	}

}
