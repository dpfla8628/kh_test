package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Member;

@Repository
public class MemberRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
//삽입	
	public void create(Member member) throws Exception {
		String query = "insert into member (member_no, member_id, member_pw, member_nick, "
				+ "member_birth, member_auth) " +
				  "values (member_seq.nextval, ?, ?, ?,?,'일반')";
		
		jdbcTemplate.update(query, member.getMember_id(),member.getMember_pw(),
				member.getMember_nick(),member.getMember_birth());
	}
//목록
	public List<Member> list() throws Exception {
		List<Member> results = jdbcTemplate.query(
			"select * from member",
			
			new RowMapper<Member>() {

				@Override
				public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
					Member member= new Member();
					
					member.setMember_no(rs.getInt("member_no"));
					member.setMember_id(rs.getString("member_id"));
					member.setMember_nick(rs.getString("member_nick"));
					member.setMember_birth(rs.getString("member_birth"));
					member.setMember_auth(rs.getString("member_auth"));
					member.setMember_point(rs.getInt("member_point"));
					Timestamp timestamp = rs.getTimestamp("member_join");
					member.setMember_join(timestamp.toLocalDateTime());
					
					return member;
				}
			}
		);
		
		return results;
	}
//보기
	public Member read(Integer member_no) throws Exception {
		List<Member> results = jdbcTemplate.query(
				"select * from member where member_no=?",
				
				new RowMapper<Member>() {

					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member();
						
						member.setMember_no(rs.getInt("member_no"));
						member.setMember_id(rs.getString("member_id"));
						member.setMember_pw(rs.getString("member_pw"));
						member.setMember_nick(rs.getString("member_nick"));
						
						return member;
					}
				}, member_no
			);
			
			return results.isEmpty() ? null : results.get(0);
	}
	
//수정
	public void modify(Member member) throws Exception {
		String query = "update member set member_pw=?, member_nick=? " +
						"where member_no=?";
		
		jdbcTemplate.update(query, member.getMember_pw(), member.getMember_nick(),
				member.getMember_no());
	}
	
//삭제
	public void remove(Integer member_no) throws Exception {
		String query = "delete from member where member_no=?";
		
		jdbcTemplate.update(query, member_no);
	}
}