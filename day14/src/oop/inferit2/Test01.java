package oop.inferit2;

public class Test01 {
	public static void main(String[] args) {
	
		Galaxy note = new Galaxy();
		//변수 3개 , 메소드4개
		note.call();
		note.sms();
		note.camera();
		note.bixby();
		
		IPhone i = new IPhone();
		//변수 3개, 메소드4개
		i.call();
		i.sms();
		i.camera();
		i.siri();
	}
}
