package com.softwaymedical.solid.isp.good;

public class Dungeon {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		warrior.hitWithAxe();
		warrior.hitWithSword();
		// Can't do anything else

		System.out.println();
		Priest priest = new Priest();
		priest.heal();
		priest.spellCast();
		// Can't do anything else

		System.out.println();
		Wizard wizard = new Wizard();
		wizard.spellCast();
		// Can't do anything else

	}

}
