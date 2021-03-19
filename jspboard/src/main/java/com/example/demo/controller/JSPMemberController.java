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
public class JSPMemberController {
	
	private static final Logger log =
			LoggerFactory.getLogger(JSPMemberController.class);
	
	@Autowired
	private MemberService service;
//목록	
	@GetMapping("/list")
	public void list(Model model) throws Exception {
		log.info("list()");
		
		model.addAttribute("list", service.list());
	}
//등록	
	@GetMapping("/register")
	public void registerForm(Member member, Model model) throws Exception {
		log.info("registerForm()");
	}
	@PostMapping("/register")
	public String register(Member member, Model model) throws Exception {
		log.info("register()");
		
		service.register(member);
		
		model.addAttribute("msg", "회원가입 완료!");
		
		return "member/success";
	}
//수정
	@GetMapping("/read")
	public void getRead(int member_no, Model model) throws Exception {
		log.info("getRead()");
		model.addAttribute(service.read(member_no));
	}
	@PostMapping("/modify")
	public String postmodify(Member member, Model model) throws Exception{
		log.info("postmodify()");
	
		service.modify(member);
		
		model.addAttribute("msg","수정 완료");
		
		return "member/success";
	}
	
	@PostMapping("/remove")
	public String remove(int member_no, Model model) throws Exception{
		log.info("remove()");
		
		service.remove(member_no);
		
		model.addAttribute("msg","삭제 성공");
		
		return "member/success";
	}
	
}