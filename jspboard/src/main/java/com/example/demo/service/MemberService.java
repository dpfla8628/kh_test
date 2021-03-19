package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.Member;

public interface MemberService {
	public void register(Member member) throws Exception;
	public List<Member> list() throws Exception;
	public Member read(Integer member_no) throws Exception;
	public void modify(Member member) throws Exception;
	public void remove(Integer member_no) throws Exception;
}
