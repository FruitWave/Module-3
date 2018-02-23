package abstract_classes.farm;

public class Baconmaster extends Ninjathing {
	public Baconmaster() {
		basedmg = 200000;
		landed = getlanded();
		damage = gettotal();
	}

	@Override
	public void throwSound() {
		System.out.println("munch");
	}

	@Override
	public void throwWeapon(int baseDamage) {
		super.throwWeapon(basedmg);

	}

}
