package com.kh.spring11;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class Test03 {
	
	private SqlSession sqlSession;
	
	@Before
	public void before() throws IOException {
		InputStream in =Resources.getResourceAsStream("mybatis/mybatis-setting.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//sqlSession = factory.openSession();		
		sqlSession = factory.openSession(true);		
	}
	
	@Test
	public void test() throws Exception {
		
		//[1]
		Map<String,Object> param = new HashMap<>();
		param.put("student_name", "김철수");
		param.put("student_score",100);
		sqlSession.insert("student.add2", param);
		//sqlSession.commit();
		
		//[2]
		Student student = new Student();
		student.setStudent_name("김영희");
		student.setStudent_score(80);
		sqlSession.insert("student.add3",student);
		
	}
}
