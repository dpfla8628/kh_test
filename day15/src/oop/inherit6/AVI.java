package oop.inherit6;

public class AVI extends MediaFile{

	public AVI(String filename) {
		super(filename);
	}
	private int speed=1;
	
	@Override
	public void forward() {
		System.out.println("영상을 빨리감기합니다");
		
	}
	@Override
	public void rewind() {
		System.out.println("영상을 되감기합니다");
		
	}
	@Override
	public void execute() {
		System.out.println("영상을 "+speed+"배속합니다");
		
	}
	

}
