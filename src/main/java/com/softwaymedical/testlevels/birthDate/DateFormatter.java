package com.softwaymedical.testlevels.birthDate;

import static java.time.format.DateTimeFormatter.ofPattern;
import static java.util.Optional.ofNullable;

import java.time.LocalDate;
import java.util.Optional;

public class DateFormatter {

	private Optional<LocalDate> date;
	private String format;

	public DateFormatter(LocalDate birthDate, String eurFormat) {
		this.date = ofNullable(birthDate);
		this.format = eurFormat;
	}

	public String convert() {
		return date.map(date -> date.format(ofPattern(format))).orElse("<empty>");
	}

}
