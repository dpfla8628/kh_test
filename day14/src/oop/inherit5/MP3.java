package oop.inherit5;

public class MP3 extends File{
	protected int duration;
	
	public MP3(String filename) {
		super(filename);
		this.duration=0;
	}
	public MP3(String filename, int filesize,int duration) {
		super(filename,filesize);
		this.duration=duration;
	}
	
	@Override
	public void execute() {
		System.out.println("음악 재생을 시작합니다");
	}
	@Override
	public void forward() {
		System.out.println("음악을 빨리감기 합니다");
	}
	@Override
	public void rewind() {
		System.out.println("음악을 되감기합니다");
	}
}
