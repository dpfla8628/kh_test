package oop.inherit6;

//클래스에 final이 붙으면 더이상 상속 불가
public final class MP3 extends MediaFile{
	//부모 클래스가 될 가능성이 없기 때문에 private로해도 무방
	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public MP3(String filename) {
		super(filename);
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
		System.out.println("음악을 되감기 합니다");
	}
}
