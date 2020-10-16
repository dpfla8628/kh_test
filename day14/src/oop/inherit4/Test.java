package oop.inherit4;

public class Test {
	public static void main(String[] args) {
		Chrome a = new Chrome("url1","version1");
		a.move();
		a.refresh();
		a.develop();
		
		Edge b = new Edge("url2","version2");
		b.move();
		b.refresh();
		b.windows();
	}
}
