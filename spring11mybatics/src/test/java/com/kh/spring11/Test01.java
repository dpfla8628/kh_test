package com.kh.spring11;

import java.io.InputStream;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;
import org.junit.Test;

//목표 : 독립 테스트로 SqlSessionFactory 생성
// 생성이 되면 myBatis를 사용할 수 있다.

public class Test01 {

	@Test
	public void test() throws Exception{
		
		//설정파일(경로)을 불러오기 위한 Stream을 준비
		//InputStream : 데이터가 들어오는 통로의 역할에 관해 규정하고 있는 추상 클래스
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-setting.xml");
		
		//SqlSessionFactory 생성
		//= myBatis를 실제로 운영하는 중심이 되는 파일
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		System.out.println(factory);
		
		//SqlSession 생성
		//= myBatis의 실제 데이터베이스 작업을 수행하는 객체
		SqlSession sqlSession = factory.openSession();
		System.out.println(sqlSession);
		
	}
}
