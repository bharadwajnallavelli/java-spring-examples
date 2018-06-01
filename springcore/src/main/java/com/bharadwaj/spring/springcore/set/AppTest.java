package com.bharadwaj.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setConfig.xml");
		CarDealer cardealer = (CarDealer)context.getBean("cardealer");
		System.out.println(cardealer);
		context.close();
	}

}
