package class12.jessie.d0301;

public class WeaponTest {

	public static void main(String[] args) {
		HandGun gun = new HandGun();
		gun.asmb();
		System.out.println("����������" + gun.getMaxBullet());
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
		ak.setMaxBullet(30);
		System.out.println("����������" + ak.getMaxBullet());
		// ak.reload();
		// ak.rapidFire();
		// ak.printInfo();
	}
}

class HandGun extends Gun {
	HandGun() {
		System.out.println("***��ǹ���췽��");
		name = "Glock 17";
		max_bullet = 17;
		bullet_unit = 1;
	}

	public void asmb() {
		System.out.println("����ǹ��ʽ��װ");
	}
}

class AK47 extends Gun {
	// ��������µ���������Ϊ

	AK47() {// ���췽������������
		System.out.println("***AK47���췽��");
		name = "AK47";
		max_bullet = 30;
		bullet_unit = 3;
	}

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
	String name;// ����
	int max_bullet;// ������
	int left_bullet; // ʣ���ӵ�����
	int bullet_unit; // ÿ�ο������ӵ�����

	public void setMaxBullet(int num) {// ���õ����������
		max_bullet = num;
	}

	public int getMaxBullet() {
		return max_bullet;
	}

	public void setBulletUnit(int num) {
		bullet_unit = num;
	}

	public void setName(String str) {
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
