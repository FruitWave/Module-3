package abstract_classes.farm;

public class Nucleate extends Ninjathing {
	public Nucleate() {
		basedmg = 2000;
		landed = getlanded();
		damage = gettotal();
	}

	@Override
	public void throwSound() {
System.out.println("BOOM");

	}

	@Override
	public void throwWeapon(int baseDamage) {
		super.throwWeapon(basedmg);

	}

}
