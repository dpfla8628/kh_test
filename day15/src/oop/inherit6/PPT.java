package oop.inherit6;

public class PPT extends File{
	
	private int size = 1;
	
	//생성자 생성
	public PPT(String filename) {
		super(filename);
	}
	
	//필수 메소드
	@Override
	public void execute() {
		System.out.println("파워포인트 애니메이션 실행");
	}

}
