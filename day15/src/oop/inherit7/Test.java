package oop.inherit7;

public class Test{
	public static void main(String[] args) {
	IPhone a = new IPhone();
	a.call();
	a.sms();
	a.camera();
	
	V60 b = new V60();
	b.call();
	b.sms();
	b.camera();
	
	ZFlip c = new ZFlip();
	c.call();
	c.sms();
	c.camera();
	}

}
