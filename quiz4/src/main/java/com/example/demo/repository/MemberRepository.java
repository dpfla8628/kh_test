package com.example.demo.repository;

import com.example.demo.entity.Member;

public interface MemberRepository {
	
	public void create(Member member) throws Exception;
}
