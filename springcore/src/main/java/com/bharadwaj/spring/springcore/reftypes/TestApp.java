package com.bharadwaj.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		context.close();
	}

}
