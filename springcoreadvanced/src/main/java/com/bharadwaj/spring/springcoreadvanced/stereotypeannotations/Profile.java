package com.bharadwaj.spring.springcoreadvanced.stereotypeannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("Sanchet")
	private String street;

	@Override
	public String toString() {
		return "Profile [street=" + street + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
