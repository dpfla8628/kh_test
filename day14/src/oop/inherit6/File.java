package oop.inherit6;

public class File {
	protected String filename;
	protected int filesize;
	
	//생성자 : 필수항목
	public File(String filename) {
		this.setFilename(filename);
		//this.setFilesize(0L);
	}
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	
	//각자의 클래스에서 수정해야 하기 대문에 final을 쓰면 안됨
	public void execute() {}
}