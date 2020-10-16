package oop.inherit3;

//하위클래스, 자식클래스
//: 부모클래스를 상속받아 기능 확장(extends)
public class Pororo extends Doll{
	//부모 클래스에 생성자가 있으면 자식인 나도 있어야 한다.
	public Pororo(String name) {
		super(name);//꼭! 부모클래스에 데이터를 넘겨줘야 상속 가능!
	}
	//상위 클래스에서 변수 2개, 메소드 1개 상속 완료
	public void nag() {
		System.out.println("조심해 크롱!");
	}
	public void print() {//this(나) , super(상위)
		System.out.println("이름 : "+this.name);//=super.name/name
		//name은 상위 클래스(Doll)에서 자식클래스도 접근
		//가능하도록 protected로 접근 제한을 둠
	}
	
	//hello가 필요한데 내용이 마음에 안드니 재정의(Override)
	@Override//<-재정의한 메소드! 원본과 이름이 다르면 오류남
	public void hello() {
		System.out.println("안녕 난 뽀로로야");
	}

}
