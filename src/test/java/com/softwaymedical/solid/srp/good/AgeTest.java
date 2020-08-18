package com.softwaymedical.solid.srp.good;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class AgeTest {
	@Test
	public void whenAgeIsUnder18_verifyAgeCheckingFalse() {
		assertThat(new UserAge(12).isAboveMajority(), is(false));
	}

	@Test
	public void whenAgeIsAboveOrEqualTo18_verifyAgeCheckingtrue() {
		assertThat(new UserAge(18).isAboveMajority(), is(true));
		assertThat(new UserAge(20).isAboveMajority(), is(true));
	}
}
