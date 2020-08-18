package com.softwaymedical.solid.srp.good;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class EmailTest {
	@Test
	public void whenMailHasArobase_verifyMailIsValid() {
		assertThat(new UserEmail("lulu@lulu.pt").isValid(), is(true));
	}

	@Test
	public void whenMailHasNoArobase_verifyMailIsInvalid() {
		assertThat(new UserEmail("lulululu.pt").isValid(), is(false));
	}
}
