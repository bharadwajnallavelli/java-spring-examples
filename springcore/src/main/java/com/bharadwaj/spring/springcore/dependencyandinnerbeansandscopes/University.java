package com.bharadwaj.spring.springcore.dependencyandinnerbeansandscopes;

import org.springframework.beans.factory.annotation.Required;

public class University {

	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", address=" + address + "]";
	}

}
