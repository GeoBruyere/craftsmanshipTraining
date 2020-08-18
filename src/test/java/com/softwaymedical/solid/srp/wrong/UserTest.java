package com.softwaymedical.solid.srp.wrong;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class UserTest {
	@Test
	public void whenAgeIsUnder18_verifyAgeCheckingFalse() {
		assertThat(new User(12, null, null).checkAge(), is(false));
	}

	@Test
	public void whenAgeIsAboveOrEqualTo18_verifyAgeCheckingtrue() {
		assertThat(new User(18, null, null).checkAge(), is(true));
		assertThat(new User(20, null, null).checkAge(), is(true));
	}

	@Test
	public void whenNameHasNoSpacesOrAccent_verifyNameSlugifiedIsSame() {
		assertThat(new User(1, "Joao", null).slugifyName(), is("Joao"));
	}

	@Test
	public void whenNameHasAccent_verifyNameSlugifiedIsWithoutAccent() {
		assertThat(new User(1, "João", null).slugifyName(), is("Joao"));
	}

	@Test
	public void whenNameHasSpace_verifyNameSlugifiedIsWithComaAsSeparator() {
		assertThat(new User(1, "Joao the joao", null).slugifyName(), is("Joao,the,joao"));
	}

	@Test
	public void whenMailHasArobase_verifyMailIsValid() {
		assertThat(new User(1, null, "lulu@lulu.pt").validateEmail(), is(true));
	}

	@Test
	public void whenMailHasNoArobase_verifyMailIsInvalid() {
		assertThat(new User(1, null, "lulululu.pt").validateEmail(), is(false));
	}
}
