package com.softwaymedical.solid.srp.good;

public class User {

	private final Age age;
	private final Name name;
	private final Email email;

	@Deprecated
	public User(int age, String name, String email) {
		this.age = new UserAge(age);
		this.name = new UserName(name);
		this.email = new UserEmail(email);
	}

	// Or better, a direct dependency injection -> no coupling, and a contract may be created !
	public User(Age age, Name name, Email email) {
		this.age = age;
		this.name = name;
		this.email = email;
	}

	public boolean isAgeAboveMajority() {
		return age.isAboveMajority();
	}

	public String getSlugifiedName() {
		return name.getSlugified();
	}

	public boolean isEmailValid() {
		return email.isValid();
	}

	public boolean receiveAlcoolRelatedNewsletter() {
		return age.isAboveMajority() && email.isValid();
	}

}
