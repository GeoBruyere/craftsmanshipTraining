package com.softwaymedical.kata.roman;

import static com.softwaymedical.kata.roman.DigitType.DECADE;
import static com.softwaymedical.kata.roman.DigitType.HUNDRED;
import static com.softwaymedical.kata.roman.DigitType.THOUSAND;
import static com.softwaymedical.kata.roman.DigitType.UNIT;
import static com.softwaymedical.kata.roman.DigitType.determine;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class DigitTypeTest {

	@Test
	public void whenDigitIsIntegerSent_verifyTypeSentIsCorrectPositionName() {
		assertThat(determine(1), is(UNIT));
		assertThat(determine(2), is(DECADE));
		assertThat(determine(3), is(HUNDRED));
		assertThat(determine(4), is(THOUSAND));
	}

	@Test
	public void whenTypeIsUnit_thenSendCorrectNumbers() {
		assertThat(UNIT.getStringFor(1), is("I"));
		assertThat(UNIT.getStringFor(2), is("II"));
		assertThat(UNIT.getStringFor(3), is("III"));
		assertThat(UNIT.getStringFor(4), is("IV"));
		assertThat(UNIT.getStringFor(5), is("V"));
		assertThat(UNIT.getStringFor(6), is("VI"));
		assertThat(UNIT.getStringFor(7), is("VII"));
		assertThat(UNIT.getStringFor(8), is("VIII"));
		assertThat(UNIT.getStringFor(9), is("IX"));
	}

	@Test
	public void whenTypeIsDecade_thenSendCorrectNumbers() {
		assertThat(DECADE.getStringFor(1), is("X"));
		assertThat(DECADE.getStringFor(2), is("XX"));
		assertThat(DECADE.getStringFor(3), is("XXX"));
		assertThat(DECADE.getStringFor(4), is("XL"));
		assertThat(DECADE.getStringFor(5), is("L"));
		assertThat(DECADE.getStringFor(6), is("LX"));
		assertThat(DECADE.getStringFor(7), is("LXX"));
		assertThat(DECADE.getStringFor(8), is("LXXX"));
		assertThat(DECADE.getStringFor(9), is("XC"));
	}

	@Test
	public void whenTypeIsHundred_thenSendCorrectNumbers() {
		assertThat(HUNDRED.getStringFor(1), is("C"));
		assertThat(HUNDRED.getStringFor(2), is("CC"));
		assertThat(HUNDRED.getStringFor(3), is("CCC"));
		assertThat(HUNDRED.getStringFor(4), is("CD"));
		assertThat(HUNDRED.getStringFor(5), is("D"));
		assertThat(HUNDRED.getStringFor(6), is("DC"));
		assertThat(HUNDRED.getStringFor(7), is("DCC"));
		assertThat(HUNDRED.getStringFor(8), is("DCCC"));
		assertThat(HUNDRED.getStringFor(9), is("CM"));
	}

	@Test
	public void whenTypeIsThousand_thenSendCorrectNumbers() {
		assertThat(THOUSAND.getStringFor(1), is("M"));
		assertThat(THOUSAND.getStringFor(2), is("MM"));
		assertThat(THOUSAND.getStringFor(3), is("MMM"));
	}
}
