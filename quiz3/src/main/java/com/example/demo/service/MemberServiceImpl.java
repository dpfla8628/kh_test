package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository repository;

	@Override
	public void signUp(Member member) throws Exception {
		// TODO Auto-generated method stub
		repository.signUp(member);
	}

	@Override
	public void modify(Integer memberNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Member member) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
