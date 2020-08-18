package com.softwaymedical.solid.srp.good;

public class User {

	private Age age;
	private Name name;
	private Email email;

	public User(int age, String name, String email) {
		this.age = new Age(age);
		this.name = new Name(name);
		this.email = new Email(email);
	}
	// Or better, a direct dependency injection -> no coupling, and a contract may be created !

	public boolean checkAge() {
		return age.check();
	}

	public boolean validateEmail() {
		return email.validate();
	}

	public String slugifyName() {
		return name.slugify();
	}
}
