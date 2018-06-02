package com.bharadwaj.spring.springcore.lifecyclemethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Reservation {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@PostConstruct
	public void hi() {
		System.out.println("inside init method");
	}
	@PreDestroy
	public void bye() {
		System.out.println("Inside destroy method");
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + "]";
	}
	
}
