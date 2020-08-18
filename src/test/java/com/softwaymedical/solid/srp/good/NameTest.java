package com.softwaymedical.solid.srp.good;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class NameTest {
	@Test
	public void whenNameHasNoSpacesOrAccent_verifyNameSlugifiedIsSame() {
		assertThat(new Name("Joao").slugify(), is("Joao"));
	}

	@Test
	public void whenNameHasAccent_verifyNameSlugifiedIsWithoutAccent() {
		assertThat(new Name("João").slugify(), is("Joao"));
	}

	@Test
	public void whenNameHasSpace_verifyNameSlugifiedIsWithComaAsSeparator() {
		assertThat(new Name("Joao the joao").slugify(), is("Joao,the,joao"));
	}
}
