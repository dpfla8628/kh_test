package oop.inherit5;

public class File {
	protected String filename;
	protected int filesize;
	
	public File(String filename) {
		this(filename,0);
		}
	public File(String filename,int filesize) {
		this.filename=filename;
		this.filesize=filesize;
		}
	
	public void execute() {
	}
	public void forward() {
	}
	public void rewind() {
	}
}