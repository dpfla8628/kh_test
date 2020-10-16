package oop.inherit5;

public class PPT extends File{
	protected int size;
	
	public PPT(String filename) {
		super(filename);
		this.size=1;
	}
	public PPT(String filename, int filesize,int size) {
		super(filename,filesize);
		this.size=size;
	}
		
	@Override
	public void execute() {
		System.out.println("파워포인트 애니메이션을 재생합니다");
	}

	public void information() {
		System.out.println("이름 : "+filename+",  크기 : "+filesize+",  장수 : "+size);
	}
}
