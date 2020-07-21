package com.softwaymedical.testlevels.acceptance;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;

import org.junit.Test;

import com.softwaymedical.testlevels.birthDate.DisplayBirthDate;

/**
 * Acceptance test for {@link DisplayBirthDate}
 */
public class DisplayBirthDateTest {
	private static final LocalDate BIRTH_DATE_14_12_2010 = LocalDate.of(2010, 12, 14);

	@Test
	public void givenDateFromDatabase_whenNurseWantsSeeBirthDate_thenDisplayBirthDateEuropeanFormat() {
		assertThat(new DisplayBirthDate(BIRTH_DATE_14_12_2010).getDisplayableDate(), is("14/12/2010"));
	}

}