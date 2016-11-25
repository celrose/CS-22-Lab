public class Character {
	
	WeaponBehavior weapon;

	Character(WeaponBehavior w) {
		this.weapon = w;
	}

	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}

	public void fight() {
		weapon.useWeapon();
	}
}