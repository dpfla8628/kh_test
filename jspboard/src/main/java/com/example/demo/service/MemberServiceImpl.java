package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberRepository repository;
	
	@Override
	public void register(Member member) throws Exception {
		repository.create(member);
	}

	@Override
	public List<Member> list() throws Exception {
		return repository.list();
	}
	
	@Override
	public Member read(Integer member_no) throws Exception {
		return repository.read(member_no);
	}

	@Override
	public void modify(Member member) throws Exception {
		repository.modify(member);
	}

	@Override
	public void remove(Integer member_no) throws Exception {
		repository.remove(member_no);
	}

}
