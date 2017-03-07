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
		System.out.println("ž���ӵ�����1�������20�˺�");

	}

	public void reload() {
		System.out.println("װ����ɣ���ǰ�ӵ�����7��");

	}

	public void description() {
		System.out.println("DesertEagle");
	}
}

class AK47 implements Weapon {

	public void fire() {
		System.out.println("�����գ��ӵ�����3�������40�˺�");

	}

	public void reload() {
		System.out.println("װ����ɣ���ǰ�ӵ�����30��");

	}

	public void description() {
		System.out.println("AK47");

	}
}

class AWP implements Weapon {
	public void fire() {
		System.out.println("�飬�ӵ�����1�������100�˺�");

	}

	public void reload() {
		System.out.println("װ����ɣ���ǰ�ӵ�����10��");

	}

	public void description() {
		System.out.println("AWP");

	}
}

class MachineGun implements Weapon {

	public void fire() {
		System.out.println("papapapapapa......���ӵ�����100�������2000�˺�");

	}

	public void reload() {
		System.out.println("װ����ɣ���ǰ�ӵ�����600��");

	}

	public void description() {
		System.out.println("MachineGun");
	}
}
