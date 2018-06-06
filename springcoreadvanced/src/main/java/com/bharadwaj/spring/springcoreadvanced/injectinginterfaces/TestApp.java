package com.bharadwaj.spring.springcoreadvanced.injectinginterfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("injectininterfaces.xml");
		OrderBO bo = (OrderBO) context.getBean("orderbo");
		bo.placeOrder();
		context.close();

	}

}
