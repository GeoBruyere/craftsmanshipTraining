package com.softwaymedical.solid.srp.good;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class EmailTest {
	@Test
	public void whenMailHasArobase_verifyMailIsValid() {
		assertThat(new Email("lulu@lulu.pt").validate(), is(true));
	}

	@Test
	public void whenMailHasNoArobase_verifyMailIsInvalid() {
		assertThat(new Email("lulululu.pt").validate(), is(false));
	}
}
