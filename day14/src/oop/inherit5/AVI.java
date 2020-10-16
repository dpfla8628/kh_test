package oop.inherit5;

public class AVI extends File{
	protected int speed;

	public AVI(String filename) {
		super(filename);
		this.speed=1;
	}
	public AVI(String filename, int filesize,int speed) {
		super(filename,filesize);
		this.speed=speed;
	}
	
	@Override
	public void execute() {
		System.out.println("영상 재생을 "+speed+"배속으로 시작합니다");
	}
	@Override
	public void forward() {
		System.out.println("영상을 빨리감기 합니다");
	}
	@Override
	public void rewind() {
		System.out.println("영상을 되감기합니다");
	}
}
