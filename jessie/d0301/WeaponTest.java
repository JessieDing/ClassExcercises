package class12.jessie.d0301;

public class WeaponTest {

	public static void main(String[] args) {
		HandGun gun = new HandGun();
		gun.asmb();
		// gun.setGunName("Glock 17");
		// gun.setBulletUnit(1);
		// gun.setMaxBullet(17);
		// gun.reload();
		// gun.fire();
		// gun.printInfo();
		AK47 ak = new AK47();
		ak.asmb();
		// ak.setGunName("AK47");
		// ak.setBulletUnit(3);
		// ak.setMaxBullet(30);
		// ak.reload();
		// ak.rapidFire();
		// ak.printInfo();
	}
}

class HandGun extends Gun {
	public void asmb() {
		System.out.println("����ǹ��ʽ��װ");
	}
}

class AK47 extends Gun {
	// ��������µ���������Ϊ
	public void rapidFire() { // ����
		int n = 0;
		while (left_bullet > 0) {
			n++;
			System.out.println("��" + n + "������");
			fire();
		}
	}

	public void asmb() {
		System.out.println("��AK47��ʽ��װ");
	}
}

class Gun {
	private String name;// ����
	int max_bullet;// ������
	int left_bullet; // ʣ���ӵ�����
	int bullet_unit; // ÿ�ο������ӵ�����

	public void setMaxBullet(int num) {// ���õ����������
		max_bullet = num;
	}

	public void setBulletUnit(int num) {
		bullet_unit = num;
	}

	public void setGunName(String str) {
		name = str;
	}

	public String getName() {
		return name;
	}

	public void fire() {
		if (left_bullet <= 0) {// ��ǰ�������ӵ���������
			return;
		}
		System.out.println("shooting!�ӵ�����" + bullet_unit + "�����Է�����ֵ���٣�");
		if (left_bullet > bullet_unit) {
			left_bullet -= bullet_unit;// ��ǰʣ���ӵ�����ԭ�����ϼ�ȥÿ�ο�����ٵ�����
		} else {
			left_bullet = 0;
		}
	}

	public void reload() {
		left_bullet = max_bullet;
		System.out.println("���װ������ǰ�ӵ�����" + left_bullet);
	}

	public void printInfo() {
		System.out.println(name + ",��󵯼�����" + max_bullet + "������ǰʣ���ӵ�" + left_bullet + "��");
	}

	public void asmb() {
		return;
	}
}
