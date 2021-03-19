package com.example.demo.service;

import com.example.demo.entity.Member;

public interface MemberService {
	
	public void signUp(Member member) throws Exception;
	
	public void modify(Integer memberNo) throws Exception;
	
	public void remove(Member member) throws Exception;
}
