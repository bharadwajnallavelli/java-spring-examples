package com.bharadwaj.spring.springcore.constructerinjection;


public class University {

	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public University(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

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
