package com.bharadwaj.spring.springcore.constructerinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("construconfig.xml");
		University university = (University) context.getBean("university");
		System.out.println(university);
		System.out.println(university.hashCode() + " first object hashcode");
		context.close();

	}

}
