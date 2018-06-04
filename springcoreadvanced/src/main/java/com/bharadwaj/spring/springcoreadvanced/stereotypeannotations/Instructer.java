package com.bharadwaj.spring.springcoreadvanced.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // @Component("anyname") for object name to call in main class
@Scope("prototype") // for scope
public class Instructer {

	@Value("10")
	private int id;
	@Value("Bharadwaj")
	private String name;
	@Value("#{courseslist}")
	private List<String> courses;
	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructer [id=" + id + ", name=" + name + ", courses=" + courses + ", profile=" + profile + "]";
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
