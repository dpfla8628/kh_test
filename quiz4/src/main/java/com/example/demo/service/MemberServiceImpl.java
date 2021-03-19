package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired(required=true)
	private MemberRepository repository;

	@Override
	public void signUp(Member member) throws Exception {
		repository.create(member);
	}
}
