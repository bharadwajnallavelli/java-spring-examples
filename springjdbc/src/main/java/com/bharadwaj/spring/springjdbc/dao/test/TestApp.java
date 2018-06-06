package com.bharadwaj.spring.springjdbc.dao.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bharadwaj.spring.springjdbc.dao.EmployeeDao;
import com.bharadwaj.spring.springjdbc.dto.Employee;

public class TestApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/bharadwaj/spring/springjdbc/dao/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeedao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Karna");
		employee.setLastName("Mantros");
		int result = dao.create(employee);
		System.out.println("Number of records inserted are: " + result);
		context.close();

	}

}
