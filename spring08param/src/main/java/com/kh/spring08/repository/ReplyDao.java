package com.kh.spring08.repository;

import java.util.List;

import com.kh.spring08.entity.ReplyDto;

public interface ReplyDao {
	public void insert(ReplyDto replyDto);
	public List<ReplyDto> select(int reply_origin);
	public void delete(int reply_no);
	public void update(ReplyDto replyDto);
}