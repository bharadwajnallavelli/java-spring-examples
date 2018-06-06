package com.bharadwaj.spring.springjdbc2.agents.dao.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bharadwaj.spring.springjdbc2.agents.dao.AgentsDao;
import com.bharadwaj.spring.springjdbc2.agents.dto.Agents;

public class TestApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		AgentsDao dao =  (AgentsDao) context.getBean("agentdaoimpl");
//		Agents agent = new Agents();
//		agent.setId(1);
//		agent.setFirstname("John");
//		agent.setLastname("wick");
//		agent.setLocation("DC");
//      int result = dao.create(agent);
//		int result = dao.update(agent);
//		Agents agent = dao.read(1);
		List<Agents> agent = dao.read();
		System.out.println("Records are : " + agent);
		context.close();
	}

}
