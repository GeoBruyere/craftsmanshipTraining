package com.softwaymedical.solid.srp.good;

public class UserEmail implements Email {

	private String email;

	public UserEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean isValid() {
		return email.contains("@");
	}

}
