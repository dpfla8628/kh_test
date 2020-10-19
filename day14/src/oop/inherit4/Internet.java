package oop.inherit4;

public class Internet {
	protected String url;
	protected String version;
	
	   public Internet(String url, String version) {
			this.url=url;
	        this.version=version;
		}	
	//매소드에서 고려해야 하는 부분 : 재정의
	//모든 브라우저가 동일해야하는 기능 -> final
	public final void move() {
		System.out.println("다른 페이지로 이동합니다");
	}
	public final void refresh() {
		System.out.println("새로고침을 시도합니다");
	}
}
