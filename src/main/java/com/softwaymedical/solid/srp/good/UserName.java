package com.softwaymedical.solid.srp.good;

import static java.text.Normalizer.normalize;
import static java.text.Normalizer.Form.NFD;

public class UserName implements Name {

	private String name;

	public UserName(String name) {
		this.name = name;
	}

	@Override
	public String getSlugified() {
		return normalize(name, NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replace(" ", ",");
	}

}
