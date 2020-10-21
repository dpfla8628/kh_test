package oop.mulit3;

public class Galaxy20s extends Phone implements Game,MusicPlayer,Camera{

	Galaxy20s a = new Galaxy20s();
	
	@Override
	public void photo() {
		System.out.println("갤럭시 촬영 기능");
	}
	
	@Override
	public void music() {
		System.out.println("갤럭시 음악재생 기능");
	}

	@Override
	public void play() {
		System.out.println("갤럭시 게임 기능");
	}

	@Override
	public void call() {
		System.out.println("갤럭시 전화 기능");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시 문자 기능");
	}

	
}
