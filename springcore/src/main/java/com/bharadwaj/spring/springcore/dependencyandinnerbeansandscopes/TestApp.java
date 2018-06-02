package com.bharadwaj.spring.springcore.dependencyandinnerbeansandscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dependinnerscope.xml");
		University university = (University) context.getBean("university");
		University university2 = (University) context.getBean("university");
		System.out.println(university);
		System.out.println(university.hashCode() + " first object hashcode");
		System.out.println(university2.hashCode() + " second objcet hashcode");
		context.close();

	}

}
