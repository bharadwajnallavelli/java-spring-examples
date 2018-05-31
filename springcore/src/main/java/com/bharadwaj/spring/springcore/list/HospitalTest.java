package com.bharadwaj.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("listconfig.xml");
		Hospital hospital = (Hospital)context.getBean("hospital");
		System.out.println("Hospital Name is: " + hospital.getName());
		System.out.println("Hospital Departments are: " + hospital.getDepartments());
		context.close();
	}

}
