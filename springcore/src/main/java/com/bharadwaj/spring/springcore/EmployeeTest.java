package com.bharadwaj.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//Define the container using class path
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//get the bean
		Employee emp = (Employee) context.getBean("emp");
		
		//print the values from the class
		System.out.println("Employee id: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());
		
		//close the context
		context.close();
	}

}
