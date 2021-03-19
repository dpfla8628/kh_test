package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	

	@GetMapping("/ajaxHome")
	public String getAjaxHome(){
		log.info("getAjaxHome()");
		
		return "ajaxHome";
	
	}
}

