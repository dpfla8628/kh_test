package oop.final1;

public class Window {
	//변할 수 있음
	private int x;
	private int y;

	//private final int width = 70;
	//최초 1회만 설정하고 이후에 수정이 안되게 하고싶다면??
	//생성자를 이용해서 값의 설정과 관련된 문제를 해결한다
	//final은 변경 불가!!!!!!!
	//=>모든 생성자에서 초기화를 해줘야 문제가 생기지 않는다!
	private final int width;
	private final int height;
	public Window(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public Window(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;//-> 반드시 초기화를 해줘야함
		this.height=height;//"
		
	}
	
}
