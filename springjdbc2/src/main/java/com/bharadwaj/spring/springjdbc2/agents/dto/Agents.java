package com.bharadwaj.spring.springjdbc2.agents.dto;

public class Agents {

	private int id;
	private String firstname;
	private String lastname;
	private String location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Agents [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", location=" + location
				+ "]";
	}
}
