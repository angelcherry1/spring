package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Book;

public class BookTest {
	@Test
	public void booktest() {
		ApplicationContext context = new AnnotationConfigApplicationContext(dao.BookDaoImpl.class);
		ApplicationContext context2 = new ClassPathXmlApplicationContext("servirces.xml");
		String name = context2.getDisplayName();
		System.out.println(name);
	/*	Book book = (Book)context.getBean("bookid");*/
		
	}
}
