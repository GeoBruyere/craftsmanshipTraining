package com.softwaymedical.solid.srp.wrong;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class UserTest {
	@Test
	public void whenAgeIsUnder18_verifyAgeCheckingFalse() {
		assertThat(new User(12, null, null).isAgeAboveMajority(), is(false));
	}

	@Test
	public void whenAgeIsAboveOrEqualTo18_verifyAgeCheckingtrue() {
		assertThat(new User(18, null, null).isAgeAboveMajority(), is(true));
		assertThat(new User(20, null, null).isAgeAboveMajority(), is(true));
	}

	@Test
	public void whenNameHasNoSpacesOrAccent_verifyNameSlugifiedIsSame() {
		assertThat(new User(1, "Joao", null).getSlugifiedName(), is("Joao"));
	}

	@Test
	public void whenNameHasAccent_verifyNameSlugifiedIsWithoutAccent() {
		assertThat(new User(1, "João", null).getSlugifiedName(), is("Joao"));
	}

	@Test
	public void whenNameHasSpace_verifyNameSlugifiedIsWithComaAsSeparator() {
		assertThat(new User(1, "Joao the joao", null).getSlugifiedName(), is("Joao,the,joao"));
	}

	@Test
	public void whenMailHasArobase_verifyMailIsValid() {
		assertThat(new User(1, null, "lulu@lulu.pt").isEmailValid(), is(true));
	}

	@Test
	public void whenMailHasNoArobase_verifyMailIsInvalid() {
		assertThat(new User(1, null, "lulululu.pt").isEmailValid(), is(false));
	}

	@Test
	public void givenAUserWithAgeAbove18AndWithAnArobaseInEmail_thenAllowToReceiveAlcoolRelatedNewsletter() {
		assertThat(new User(19, null, "lulu@lulu.fr").receiveAlcoolRelatedNewsletter(), is(true));
	}

	@Test
	public void givenAUserWithAgeBelow18AndWithAnArobaseInEmail_thenNotAllowToReceiveAlcoolRelatedNewsletter() {
		assertThat(new User(12, null, "lulu@lulu.fr").receiveAlcoolRelatedNewsletter(), is(false));
	}

	@Test
	public void givenAUserWithAgeAbove18AndWithoutAnArobaseInEmail_thenNotAllowToReceiveAlcoolRelatedNewsletter() {
		assertThat(new User(19, null, "lulu.lulu.fr").receiveAlcoolRelatedNewsletter(), is(false));
	}

	@Test
	public void givenAUserWithAgeBelow18AndWithoutAnArobaseInEmail_thenAllowToReceiveAlcoolRelatedNewsletter() {
		assertThat(new User(12, null, "lulu.lulu.fr").receiveAlcoolRelatedNewsletter(), is(false));
	}
}
