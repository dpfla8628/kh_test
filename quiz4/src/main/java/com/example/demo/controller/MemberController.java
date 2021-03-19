package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	static final private Logger log = 
			LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/sign-up")
	public void getSignUp (Member member) {
		log.info("getSignUp()");
	}
	
	@PostMapping("/sign-up")
	public String postSignUp (Member member, Model model) throws Exception {
		log.info("postSignUp()");
		
		service.signUp(member);
		
		model.addAttribute("msg", "회원가입이 성공적으로 완료되었습니다.");
		
		return "/board/success";
	}
}
