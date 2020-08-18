package com.softwaymedical.solid.srp.good;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class UserTest {
	private static final Age USER_WITH_MAJORITY = () -> true;
	private static final Email USER_WITH_VALID_EMAIL = () -> true;
	private static final Age USER_WITHOUT_MAJORITY = () -> false;
	private static final Email USER_WITHOUT_VALID_EMAIL = () -> false;

	@Test
	public void givenAUserCanDrinkAndHasValidEmail_thenAllowToReceiveAlcoolRelatedNewsletter() {
		assertThat(new User(USER_WITH_MAJORITY, null, USER_WITH_VALID_EMAIL).receiveAlcoolRelatedNewsletter(), is(true));
	}

	@Test
	public void givenAUserCannotDrinkAndHasValidEmail_thenAllowToReceiveAlcoolRelatedNewsletter() {
		assertThat(new User(USER_WITHOUT_MAJORITY, null, USER_WITH_VALID_EMAIL).receiveAlcoolRelatedNewsletter(), is(false));
	}

	@Test
	public void givenAUserCanDrinkAndHasNotValidEmail_thenAllowToReceiveAlcoolRelatedNewsletter() {
		assertThat(new User(USER_WITH_MAJORITY, null, USER_WITHOUT_VALID_EMAIL).receiveAlcoolRelatedNewsletter(), is(false));
	}

	@Test
	public void givenAUserCannotDrinkAndHasNotValidEmail_thenAllowToReceiveAlcoolRelatedNewsletter() {
		assertThat(new User(USER_WITHOUT_MAJORITY, null, USER_WITHOUT_VALID_EMAIL).receiveAlcoolRelatedNewsletter(), is(false));
	}
}
