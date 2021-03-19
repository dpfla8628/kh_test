package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.MyBatisBoard;

public interface MyBatisBoardRepository {
	
	public void create(MyBatisBoard board) throws Exception;
	
	public MyBatisBoard read(Integer boardNo) throws Exception;
	
	public void update(MyBatisBoard board) throws Exception;
	
	public void delete(Integer boardNo) throws Exception;
	
	public List<MyBatisBoard> list() throws Exception;
}
