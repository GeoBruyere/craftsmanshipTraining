package com.softwaymedical.solid.isp.good;

public class Warrior implements SwordFighter, AxeFighter {

	@Override
	public void hitWithAxe() {
		System.out.println("Warrior hitting with an axe - I'm a WARRIOR AND I WILL KICK YOUR ASS WITH MY AXE !");
	}

	@Override
	public void hitWithSword() {
		System.out.println("Warrior hitting with a sword - Ok I prefer the axe but I can destroy you with this beautiful sword.");
	}

}
