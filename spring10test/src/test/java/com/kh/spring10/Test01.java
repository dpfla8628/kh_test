package com.kh.spring10;

import org.junit.Test;

public class Test01 {
	
	//단위 테스트 메소드
	//규칙 : 접근제한 public, 반환형void, 이름 자유, 매개변수x
	//만들어진 메소드에 테스트용임을 표시하도록 @Test를 부여한다
	@Test
	public void hello() {
		System.out.println("Hello!");
	}
}
