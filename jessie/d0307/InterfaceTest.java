package class12.jessie.d0307;

public class InterfaceTest {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int index = (int) (Math.random() * 4);
			Weapon w = createWeapon(index);
			w.description();
			w.fire();
			w.reload();
		}
	}

	public static Weapon createWeapon(int type) {
		if (type == 0) {
			return new DesertEagle();
		} else if (type == 1) {
			return new AK47();
		} else if (type == 2) {
			return new AWP();
		} else {
			return new MachineGun();
		}
	}
}

class DesertEagle implements Weapon {
	public void fire() {
		System.out.println("啪，子弹减少1发！造成20伤害");

	}

	public void reload() {
		System.out.println("装弹完成，当前子弹数量7发");

	}

	public void description() {
		System.out.println("DesertEagle");
	}
}

class AK47 implements Weapon {

	public void fire() {
		System.out.println("哒哒哒，子弹减少3发！造成40伤害");

	}

	public void reload() {
		System.out.println("装弹完成，当前子弹数量30发");

	}

	public void description() {
		System.out.println("AK47");

	}
}

class AWP implements Weapon {
	public void fire() {
		System.out.println("砰，子弹减少1发！造成100伤害");

	}

	public void reload() {
		System.out.println("装弹完成，当前子弹数量10发");

	}

	public void description() {
		System.out.println("AWP");

	}
}

class MachineGun implements Weapon {

	public void fire() {
		System.out.println("papapapapapa......，子弹减少100发！造成2000伤害");

	}

	public void reload() {
		System.out.println("装弹完成，当前子弹数量600发");

	}

	public void description() {
		System.out.println("MachineGun");
	}
}
