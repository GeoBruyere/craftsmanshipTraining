package com.softwaymedical.testlevels.ut;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import org.junit.Test;

import com.softwaymedical.testlevels.birthDate.DateFormatter;

/**
 * Unit test for {@link DateFormatter}
 */
public class DateFormatterTest {

	private static final LocalDate THE_1_9_2020 = LocalDate.of(2020, 9, 1);
	private static final LocalDate NO_DATE = null;

	@Test
	public void givenDate_andFormatNeeded_whenAskingConversion_thenDateDisplayedFormatNeeded() {
		assertThat(new DateFormatter(THE_1_9_2020, "d/M/yyyy").convert(), is("1/9/2020"));
		assertThat(new DateFormatter(THE_1_9_2020, "dd/MM/yyyy").convert(), is("01/09/2020"));
	}

	@Test
	public void givenNoDate_andFormatNeeded_whenAskingConversion_thenReturnEmpty() {
		assertThat(new DateFormatter(NO_DATE, "dd/MM/yyyy").convert(), is("<empty>"));
	}

}
