package com.bharadwaj.spring.springcore.lifecyclemethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReservationTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
		Reservation reservation = (Reservation)context.getBean("reserve");
		System.out.println(reservation.getId());
		context.registerShutdownHook();
		context.close();
		
	}

}
