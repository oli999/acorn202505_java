package test.mypac;

public class NavalWeapon extends Weapon{
	@Override
	public void attack() {
		prepare();
		System.out.println("해상 공격을 해요!");
	}
}
