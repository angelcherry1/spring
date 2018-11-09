package com.ss.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ss.pojo.Book;

public class test {
	SqlSessionFactory sqlSessionFactory = null;
	SqlSession session = null;

	@Before
	public void before() {
		try {
			sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsReader("mybatisConfig.xml"));
			session = sqlSessionFactory.openSession(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void selectBook() {
		Object one = session.selectOne("com.ss.mapper.BookMapper.selectBook", 123L);
		System.out.println(one);
	}

	@Test
	public void deleteBook() {
		session.delete("com.ss.mapper.BookMapper.deleteBook", 10024L);
	}

	@After
	public void after() {
		session.close();

	}
}
