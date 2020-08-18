package com.softwaymedical.solid.srp.good;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class AgeTest {
	@Test
	public void whenAgeIsUnder18_verifyAgeCheckingFalse() {
		assertThat(new Age(12).check(), is(false));
	}

	@Test
	public void whenAgeIsAboveOrEqualTo18_verifyAgeCheckingtrue() {
		assertThat(new Age(18).check(), is(true));
		assertThat(new Age(20).check(), is(true));
	}
}
