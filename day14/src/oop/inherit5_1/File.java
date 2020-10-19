package oop.inherit5_1;

public class File {
	//맴버 변수(인스턴스 변수)
	protected String filename;
	protected long filesize;
	
	//생성자 : 필수항목
	public File(String filename) {
		this.setFilename(filename);
		//this.setFilesize(0L);
	}
	
	//멤버 메소드(setter, getter, 기타..)
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public long getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	
	//각자의 클래스에서 수정해야 하기 대문에 final을 쓰면 안됨
	//재정의가 필요하다 = 추상 메소드 :껍데기만 있는 것
	public void execute() {}
}