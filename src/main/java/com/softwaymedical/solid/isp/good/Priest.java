package com.softwaymedical.solid.isp.good;

public class Priest implements Healer, SpellCaster {

	@Override
	public void heal() {
		System.out.println("Priest healing - That's my speciality ! I cure your ill my friend.");
	}

	@Override
	public void spellCast() {
		System.out.println("Priest casting a spell - Ok I can help with a little fireball");
	}

}
