package com.softwaymedical.solid.srp.good;

import static java.text.Normalizer.normalize;
import static java.text.Normalizer.Form.NFD;

public class Name {

	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String slugify() {
		return normalize(name, NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replace(" ", ",");
	}

}
