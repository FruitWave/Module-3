package abstract_classes.farm;

public class Bulletwhippist extends Ninjathing {
	public Bulletwhippist() {
		basedmg = 20;
		landed = getlanded();
		damage = gettotal();
	}

	@Override
	public void throwSound() {
		System.out.println("WHAP");
	}

	@Override
	public void throwWeapon(int baseDamage) {
		super.throwWeapon(basedmg);

	}

}
