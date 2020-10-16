package oop.inherit4;

public class Edge extends Internet{
	
	public Edge(String url, String version) {
		super(url, version);
	}

	public void windows() {
		System.out.println("원도우와 연동을 시도합니다");
	}
}
