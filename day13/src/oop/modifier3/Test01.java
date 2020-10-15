package oop.modifier3;

public class Test01 {
	public static void main(String[] args) {
		House h1 = new House();
		House h2 = new House();
		
		//설정하는 코드
		h1.setArea("강남");
		h1.setSize(24);
		h1.setPrice(2000);
		
		h2.setArea("독도");
		h2.setSize(100);
		h2.setPrice(5000);
		
		//반환하는 코드? private이기 때문에 불가능!!
		//int total = h1.price + h2.price;
		//->은닉화 구조를 통해 가져온다.
		int total = h1.getPrice()+h2.getPrice();
		
		//가격 비교
		if(h1.getPrice()>h2.getPrice()) {
			System.out.println(h1.getArea()+"에 있는 집이 더 비쌉니다");
		}
		else if(h1.getPrice()<h2.getPrice()) {
			System.out.println(h2.getArea()+"에 있는 집이 더 비쌉니다");
		}
		else {
			System.out.println("가격이 같습니다");
		}
		
	}

}
