package oop.inherit6_abstract;

//추상클래스 장점
//하위 클래스에서 오버로드를 빠르게 할 수 있다!

public abstract class MediaFile extends File{

	public MediaFile(String filename) {
		super(filename);
	}
	
	//추상 메소드 추가
	//public abstract void execute();
	public abstract void forward();
	public abstract void rewind();
}
