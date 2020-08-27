package com.softwaymedical.solid.isp.wrong;

public class Dungeon {

	public static void main(String[] args) {
		Dungeon dungeonWithWarrior = new Dungeon(new Warrior());
		dungeonWithWarrior.launchCastSpell();
		dungeonWithWarrior.launchHitWithAxe();
		dungeonWithWarrior.launchHitWithSword();
		dungeonWithWarrior.launchHeal();

		System.out.println();
		Dungeon dungeonWithPriest = new Dungeon(new Priest());
		dungeonWithPriest.launchCastSpell();
		dungeonWithPriest.launchHitWithAxe();
		dungeonWithPriest.launchHitWithSword();
		dungeonWithPriest.launchHeal();
	}

	private Character character;

	Dungeon(Character character) {
		this.character = character;
	}

	private void launchCastSpell() {
		character.castSpell();
	}

	private void launchHitWithAxe() {
		character.hitWithAxe();
	}

	private void launchHitWithSword() {
		character.hitWithSword();
	}

	private void launchHeal() {
		character.heal();
	}

}
