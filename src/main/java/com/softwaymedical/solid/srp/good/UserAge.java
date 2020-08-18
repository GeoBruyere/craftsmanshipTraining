package com.softwaymedical.solid.srp.good;

public class UserAge implements Age {

	private int age;

	public UserAge(int age) {
		this.age = age;
	}

	@Override
	public boolean isAboveMajority() {
		return age >= 18;
	}

}
