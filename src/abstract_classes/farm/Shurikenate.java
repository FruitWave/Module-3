package abstract_classes.farm;

public class Shurikenate extends Ninjathing {
	public Shurikenate() {
		basedmg = 200;
		landed = getlanded();
		damage = gettotal();
	}

	@Override
	public void throwSound() {
		System.out.println("SHURIKEN THROW");
	}

	@Override
	public void throwWeapon(int baseDamage) {
		super.throwWeapon(basedmg);

	}

}