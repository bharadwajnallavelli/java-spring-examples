package com.bharadwaj.spring.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee_info values(?,?,?)";
		int result = jdbcTemplate.update(sql, 1,"Bharadwaj","Nallavelli");
		System.out.println("Number of records inserted are: " + result);
		context.close();

	}

}
