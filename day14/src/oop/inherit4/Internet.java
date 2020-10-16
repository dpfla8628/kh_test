package oop.inherit4;

public class Internet {
	protected String url;
	protected String version;
	
	   public Internet(String url, String version) {
			this.url=url;
	        this.version=version;
		}	
	
	public void move() {
		System.out.println("다른 페이지로 이동합니다");
	}
	public void refresh() {
		System.out.println("새로고침을 시도합니다");
	}
}
