package com.bharadwaj.spring.springcoreadvanced.stereotypeannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("stereotype.xml");
		Instructer instructer = (Instructer) context.getBean("instructer");
		System.out.println(instructer);
		context.close();
	}
}
