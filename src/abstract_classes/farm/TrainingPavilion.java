package abstract_classes.farm;

import java.util.ArrayList;

public class TrainingPavilion {
	public static void main(String[] args) {
		ArrayList<Ninjathing> pavilion = new ArrayList<>();
		Shurikenate mid = new Shurikenate();
		Nucleate supp = new Nucleate();
		Bulletwhippist bot = new Bulletwhippist();
		Baconmaster topduo = new Baconmaster();
		Baconmaster topsolo = new Baconmaster();
		Shurikenate jungle = new Shurikenate();
		pavilion.add(mid);
		pavilion.add(supp);
		pavilion.add(bot);
		pavilion.add(topduo);
		pavilion.add(topsolo);
		pavilion.add(jungle);
		int totaldmg = 0;
		for (Ninjathing ninjadude : pavilion) {
			ninjadude.throwSound();
			ninjadude.throwWeapon(ninjadude.basedmg);
			if (ninjadude.landed) {
				totaldmg += ninjadude.damage;
			}
		}
		System.out.println("TOTAL DAMAGE: " + totaldmg);
	}
}
