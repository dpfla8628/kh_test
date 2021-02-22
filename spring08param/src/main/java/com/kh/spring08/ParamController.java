package com.kh.spring08;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/param")
public class ParamController {
	//입력 페이지는 주소 한개를 get/post로 나누어서 사용한다
	//get방식으로 접근하면 입력 헤이지로 안내
	//post방식으로 접근하면 데이터를 받아서 추가 작업을 수행
	
	//GET방식
	@RequestMapping(value = "/test1",method = RequestMethod.GET)
	public String test1() {
		return "param/test1";
	}
	
	
	
}
