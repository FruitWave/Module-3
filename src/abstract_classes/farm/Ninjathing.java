package abstract_classes.farm;

import java.util.Random;

import javax.swing.JOptionPane;

public abstract class Ninjathing {
	static int bonusdamage = 40;
	int basedmg;
	boolean landed;
	int damage;

	public abstract void throwSound();

	public void throwWeapon(int damagecap) {
		bonusdamage += bonusdamage / 10;
		int random = (new Random().nextInt(damagecap)) + bonusdamage;
		int landedint = new Random().nextInt(2);
		boolean landed = landedint == 1 ? true : false;

		if (landed) {
			System.out.println("Damage lands. Damage dealt is: " + random);
		} else {
			System.out.println("Damage lands: " + landed);
		}
		this.landed = landed;
		damage = random;
	}

	public boolean getlanded() {
		return landed;
	}

	public int gettotal() {
		return damage;
	}

}