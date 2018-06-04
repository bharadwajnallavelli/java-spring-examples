package com.bharadwaj.spring.springcoreadvanced.autowiring.standalonecollections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("standalonecollec.xml");
		ProductsList productslist = (ProductsList) context.getBean("productslist");
		System.out.println(productslist);
		System.out.println(productslist.hashCode() + " first object hashcode");
		context.close();

	}

}
