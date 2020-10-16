package oop.inherit5;

public class Test {
	public static void main(String[] args) {
		MP3 a = new MP3("엠피쓰리");
		a.execute();
		a.forward();
		a.rewind();
		
		AVI b = new AVI("동영상",1,2);
		b.execute();
		b.forward();
		b.rewind();
		
		PPT c = new PPT("피피티");
		c.execute();
		c.information();
	}
}
