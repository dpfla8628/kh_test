package oop.inherit5_1;

//추상 클래스

public class MediaFile extends File{

	public MediaFile(String filename) {
		super(filename);
	}
	//재정의 나중에 할 예정이므로 final x
	//전부 다 고칠 예정이기 때문에 내용 작성할 필요없음
	//껍데기만 있다 = 추상 메소드
	public void forward() {}
	public void rewind() {}
}
