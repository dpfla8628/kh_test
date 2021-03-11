package com.kh.spring08.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kh.spring08.entity.MemberDto;
import com.kh.spring08.entity.MemberRankVO;

//repository를 등록해봤자 안되니까 쓰지말자

public interface MemberDao {
	public void insert(MemberDto dto) throws Exception;
	public List<MemberDto> select() throws Exception;
	public List<MemberDto> select(String keyword) throws Exception;
	public List<MemberDto> select(String type, String keyword) throws Exception;
	public MemberDto find(int member_no) throws Exception;
	public MemberDto find(String member_id) throws Exception;
	public boolean login(MemberDto dto) throws Exception;
	public boolean delete(int member_no) throws Exception;
	public boolean edit(MemberDto dto) throws Exception;
	public boolean editPassword(int member_no, String member_pw, String change_pw) throws Exception;
	public boolean editByAdmin(MemberDto dto) throws Exception;
	public boolean editPasswordByAdmin(int member_no, String member_pw) throws Exception;
	public List<MemberRankVO> getPointRank(int start, int end) throws Exception;
	

}