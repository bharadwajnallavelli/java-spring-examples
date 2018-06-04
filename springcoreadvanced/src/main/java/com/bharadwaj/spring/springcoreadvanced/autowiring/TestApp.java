package com.bharadwaj.spring.springcoreadvanced.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowirebyname.xml");
		University university = (University) context.getBean("university");
		System.out.println(university);
		System.out.println(university.hashCode() + " first object hashcode");
		context.close();

	}

}
