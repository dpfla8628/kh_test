package oop.inherit4;

public class Chrome extends Internet{

	public Chrome(String url, String version) {
		//super는 처음에 단 한번만 부를 수 있음
		super(url, version);
	}

	public void develop() {
		System.out.println("개발자도구를 실행합니다");
	}
}
