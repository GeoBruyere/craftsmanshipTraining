package com.softwaymedical.solid.srp.good;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class NameTest {
	@Test
	public void whenNameHasNoSpacesOrAccent_verifyNameSlugifiedIsSame() {
		assertThat(new UserName("Joao").getSlugified(), is("Joao"));
	}

	@Test
	public void whenNameHasAccent_verifyNameSlugifiedIsWithoutAccent() {
		assertThat(new UserName("João").getSlugified(), is("Joao"));
	}

	@Test
	public void whenNameHasSpace_verifyNameSlugifiedIsWithComaAsSeparator() {
		assertThat(new UserName("Joao the joao").getSlugified(), is("Joao,the,joao"));
	}
}
