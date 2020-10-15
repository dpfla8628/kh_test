package oop.modifier3;
//집=지역+평수+가격
public class House {

	//멤버변수(인스턴스변수)-반드시 잠금처리
	//접근 제한자 : private : this만 접근 가능
	//		  : 	
	private String area;
	private int size, price;
	
	//멤버 메소드(인스턴스 메소드)-공개처리
	
	//*Setter 메소드 : 설정 처리 기능(외부에서 들어오는 정보를 연결시킴)
	void setArea(String area) {
		this.area=area;
	}
	void setSize(int size) {
		this.size=size;
	}
	void setPrice(int price) {
		this.price=price;
	}
	
	//*Getter 메소드 : 반환 처리 기능 =>체계적, 효율적
	//-void : 반환 값(결과물)이 없음
	//-String : 반환 값(결과물)이 String형태
	String getArea() {
		//:내가 가진 area 변수 값을 반환 후 종료
		return this.area;
	}
	int getSize() {
		return this.size;
	}
	int getPrice() {
		return this.price;
	}
	
	
}
