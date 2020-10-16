package oop.inherit4;

public class Chrome extends Internet{

	public Chrome(String url, String version) {
		super(url, version);
	}

	public void develop() {
		System.out.println("개발자도구를 실행합니다");
	}
}
