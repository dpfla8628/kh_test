package com.kh.spring10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test02 {
	
	//테스트를 구성하다보면 "사전 준비"작업과 "마무리"작업이 필요한 경우가 생긴다.
	//=Junit에서는 이를 위한 설정들이 존재한다
	//한계점 : 스프링과 연동시켜서 테스트가 어렵다
	@Test
	public void test() {
		System.out.println("test!");
	}
	
	@Before
	public void before() {
		System.out.println("사전 준비");
	}
	@After
	public void after() {
		System.out.println("마무리 코드");
	}
}
