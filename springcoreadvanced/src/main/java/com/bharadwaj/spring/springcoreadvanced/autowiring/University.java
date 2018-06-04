package com.bharadwaj.spring.springcoreadvanced.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class University {

	private String name;
	//@Autowired can be done for attribute too
	private Address address;

	//@Autowired can be used for constructor
	public University(Address address) {
		super();
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired can be done to setter methods
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "University [name=" + name + ", address=" + address + "]";
	}

	
}
