package test.main;

import test.mypac.MyWeapon;
import test.mypac.NavalWeapon;
import test.mypac.SkyWeapon;
import test.mypac.Weapon;

public class MainClass07 {
	public static void main(String[] args) {
		
		/*
		 *  여기서(main 메소드 안쪽) 아래에 정의된 useWeapon() 메소드를 호출하려면?
		 */
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("아무데나 공격");
			}
		};
				
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("어딜 공격하지?");
			}
		});
		
	}	
	
	public static void useWeapon(Weapon w) {
		w.attack();
	}
}







