package com.kh.spring11;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class Test02 {
	
	@Test
	public void test() throws Exception {
		InputStream in =Resources.getResourceAsStream("mybatis/mybatis-setting.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = factory.openSession();

		session.insert("student.add");
		session.commit();
	}
}
