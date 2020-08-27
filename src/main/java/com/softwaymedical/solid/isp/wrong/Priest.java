package com.softwaymedical.solid.isp.wrong;

public class Priest implements Character {

	@Override
	public void castSpell() {
		System.out.println("Priest casting a spell - Ok I can help with a little fireball");
	}

	@Override
	public void hitWithAxe() {
		System.out.println("Priest hitting with an axe - Come on you think I'm a brainless bully ?");
	}

	@Override
	public void hitWithSword() {
		System.out.println("Priest hitting with a sword - Damn, I only know how to use my big stick.");
	}

	@Override
	public void heal() {
		System.out.println("Priest healing - That's my speciality ! I cure your ill my friend.");
	}

}
