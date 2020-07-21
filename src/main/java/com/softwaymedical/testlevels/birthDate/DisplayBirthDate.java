package com.softwaymedical.testlevels.birthDate;

import java.time.LocalDate;

public class DisplayBirthDate {

	private static final String EUR_FORMAT = "d/M/yyyy";

	private final LocalDate birthDate;

	public DisplayBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getDisplayableDate() {
		return new DateFormatter(birthDate, EUR_FORMAT).convert();
	}

}