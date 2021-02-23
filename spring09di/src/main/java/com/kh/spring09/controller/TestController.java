package com.kh.spring09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kh.spring09.repository.TestDao;

@Controller
public class TestController {
	
	//TestDao의 자식클래스 중 등록된 것을 사용하겠다는 뜻.
	@Autowired
	private TestDao testDao;
}
