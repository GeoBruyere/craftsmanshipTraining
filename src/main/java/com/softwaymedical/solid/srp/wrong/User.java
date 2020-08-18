package com.softwaymedical.solid.srp.wrong;

import static java.text.Normalizer.normalize;
import static java.text.Normalizer.Form.NFD;

public class User {
	private int age;
	private String name;
	private String email;

	public User(int age, String name, String email) {
		this.age = age;
		this.name = name;
		this.email = email;
	}

	public boolean isAgeAboveMajority() {
		return age >= 18;
	}

	public String getSlugifiedName() {
		return normalize(name, NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replace(" ", ",");
	}

	public boolean isEmailValid() {
		return email.contains("@");
	}

	public boolean receiveAlcoolRelatedNewsletter() {
		return isEmailValid() && isAgeAboveMajority();
	}
}
