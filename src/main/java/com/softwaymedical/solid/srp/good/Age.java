package com.softwaymedical.solid.srp.good;

public class Age {

	private int age;

	public Age(int age) {
		this.age = age;
	}

	public boolean check() {
		return age >= 18;
	}

}
