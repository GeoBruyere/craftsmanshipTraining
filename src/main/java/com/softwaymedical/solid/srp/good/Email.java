package com.softwaymedical.solid.srp.good;

public class Email {

	private String email;

	public Email(String email) {
		this.email = email;
	}

	public boolean validate() {
		return email.contains("@");
	}

}
