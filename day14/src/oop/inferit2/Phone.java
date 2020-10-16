package oop.inferit2;


//상위(super)클래스 또는 부모(parent)클래스
//클래스의 공통점을 추상화시켜 만든 클래스
public class Phone {
	
	private String number;
	private String color;
	private int price;
	
	public void call() {
		System.out.println("전화 걸기!");
	}
	public void sms() {
		System.out.println("문자 보내기!");
	}
	public void camera() {
		System.out.println("카메라 촬영!");
	}

}
