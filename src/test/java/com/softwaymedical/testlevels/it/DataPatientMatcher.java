package com.softwaymedical.testlevels.it;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

import com.softwaymedical.testlevels.dto.DataPatient;

public class DataPatientMatcher extends TypeSafeDiagnosingMatcher<DataPatient> {

	private DataPatient dataPatient;

	public static Matcher<DataPatient> patient(DataPatient dataPatient) {
		return new DataPatientMatcher(dataPatient);
	}

	public DataPatientMatcher(DataPatient dataPatient) {
		this.dataPatient = dataPatient;
	}

	@Override
	public void describeTo(Description description) {
		description.appendText("We need a patient with birthDate: ").appendValue(dataPatient.getBirthDate());
	}

	@Override
	protected boolean matchesSafely(DataPatient dataPatient, Description mismatchDescription) {
		if (dataPatient.getBirthDate().equals(this.dataPatient.getBirthDate())) {
			return true;
		}
		mismatchDescription.appendText("We have a patient with birthDate: ").appendValue(dataPatient.getBirthDate());
		return false;
	}

}
