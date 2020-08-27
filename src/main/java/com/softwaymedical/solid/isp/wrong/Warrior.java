package com.softwaymedical.solid.isp.wrong;

public class Warrior implements Character {

	@Override
	public void castSpell() {
		System.out.println("Warrior casting a spell - Holy shit, I'm a warrior, how am I supposed to know how to cast a spell ?");
	}

	@Override
	public void hitWithAxe() {
		System.out.println("Warrior hitting with an axe - I'm a WARRIOR AND I WILL KICK YOUR ASS WITH MY AXE !");
	}

	@Override
	public void hitWithSword() {
		System.out.println("Warrior hitting with a sword - Ok I prefer the axe but I can destroy you with this beautiful sword.");
	}

	@Override
	public void heal() {
		System.out.println("Warrior healing - Ok do you know what ? Go buy a pill I'm not a doctor.");
	}

}
