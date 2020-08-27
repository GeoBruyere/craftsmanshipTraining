package com.softwaymedical.kata.roman;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class NombreRomainReverseTest {

	@Test
	public void whenNumberIs3333_thenAnswerIsMMMCCCXXXIII() {
		assertThat(new RomanReversor(3333).conversionToArabic(), is("MMMCCCXXXIII"));
	}

	@Test
	public void whenNumberIs1999_thenAnswerIsMCMXCIX() {
		assertThat(new RomanReversor(1999).conversionToArabic(), is("MCMXCIX"));
	}
}
