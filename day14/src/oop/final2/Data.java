package oop.final2;

public class Data {
	
	private final String id;
	private String pass;//비번, 주민번호, 폰번호는 문자열이다
	private String name;
	private int point;
	

	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getId() {
		return id;
	}
	
	
	//메인의 값을 여기서 설정해줌
	public Data(String id, String pass) {
		this(id, pass, "-");
		//포인트는 어차피 디폴트가 0이기때문에 굳이 설정할 필요 x
	}
	
	public Data(String id, String pass, String name) {
		this.id=id;//final이라 setter 생성 x
		this.setPass(pass);
		this.setName(name);
	}
	public void print() {
		System.out.println("아이디 : "+this.id);
		System.out.println("비밀번호 : "+this.pass);
		System.out.println("닉네임 : "+this.name);
		System.out.println("포인트 : "+this.point);
	}

}
