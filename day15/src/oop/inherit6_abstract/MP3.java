package oop.inherit6_abstract;

public class MP3 extends MediaFile{

	private int duration;
	
	public MP3(String filename) {
		super(filename);
	}
	
	public void forward() {
		System.out.println("음악을 빨리감기합니다");
	}
	public void rewind() {
		System.out.println("음악을 되감기합니다");
	}
	public void execute() {
		System.out.println("음악을 재생합니다");
	}
	
}
