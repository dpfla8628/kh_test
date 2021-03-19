package com.example.demo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Member;

@Repository
public class MemberRepository {
	
	private static final Logger log =
			LoggerFactory.getLogger(MemberRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void signUp(Member member) throws Exception {
		log.info("signUp()");

		String query = "insert into jspmember (member_no, id, "
				+ "password, email, phone_num) " 
				+ "values (jspmember_seq.nextval, ?, ?, ?, ?)";
		
		jdbcTemplate.update(query, member.getId(), member.getPassword(), 
				member.getEmail(), member.getPhoneNumber());
	}

	public void update(Member board) {
		// TODO Auto-generated method stub
		/*
		String query = "update jspboard set title = ?, content = ? "
					+ "where board_no = ?";
		
		jdbcTemplate.update(query, board.getTitle(), 
				board.getContent(), board.getBoardNo());
				*/
	}

	public void delete(Integer boardNo) {
		// TODO Auto-generated method stub
		/*
		String query = "delete from jspboard where board_no = ?";
		
		jdbcTemplate.update(query, boardNo);
		*/
	}
}
