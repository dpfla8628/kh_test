package oop.modifier4;

//다른 패키지의 클래스를 이용하고 싶으면 import를 통해 알려줘야함
import oop.modifier3.House;

public class Test01 {
	public static void main(String[] args) {
	
		//다른 패키지(opp.modifier3)에 존재하는 House의 객체를 생성
		House h1 = new House();
		
		//접근 제한자가 없는 경우에는 "같은 패지키" 내에서만 접근 가능
		//자바에서는 같은 패키지가 기본 인식 단위다(default : package)
		//다른 패키지의 클래스를 사용하기 위해서는 import를 사용해야함
		h1.setArea("강남");

		
	}
	
}
