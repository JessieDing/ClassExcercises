package class12.jessie.d0301;

public class WeaponTest {

	public static void main(String[] args) {
		// HandGun gun = new HandGun("������ǹ", 6, 1);
		// gun.reload();
		// gun.printInfo();
		// gun.asmb();
		// System.out.println("����������" + gun.getMaxBullet());
		// gun.setGunName("Glock 17");
		// gun.setBulletUnit(1);
		// gun.setMaxBullet(17);
		// gun.reload();
		// gun.fire();
		// gun.printInfo();
		AK47 ak = new AK47("С����AK47", 25, 3);
		ak.reload();
		ak.printInfo();
		AK47 ak1 = new AK47("�󵯼�AK47", 30, 3);
		ak1.reload();
		ak1.printInfo();
		// ak.asmb();
		// ak.setGunName("AK47");
		// ak.setBulletUnit(3);
		// ak.setMaxBullet(30);
		// System.out.println("����������" + ak.getMaxBullet());
		// ak.reload();
		// ak.rapidFire();
		// ak.printInfo();
	}
}

class HandGun extends Gun {
	HandGun() {// ���������Ĺ��췽������������
		System.out.println("***��ǹ���췽��");
		setName("Glock 17");
		setMaxBullet(17);
		setBulletUnit(1);
	}

	HandGun(String name, int maxBullet, int unitBullet) {// �������Ĺ��췽������������������������
		System.out.println("***��������������ǹ���췽��");
		setName("Glock 17");
		setMaxBullet(17);
		setBulletUnit(1);
	}

	public void asmb() {
		System.out.println("����ǹ��ʽ��װ");
	}
}

class AK47 extends Gun {
	// ��������µ���������Ϊ
	AK47() {// �������췽������������
		System.out.println("***AK47���췽��");
		this.setName("AK47");
		this.setMaxBullet(30);
		this.setBulletUnit(3);
	}

	AK47(String name, int maxBullet, int unitBullet) {// �������Ĺ��췽������������������������
		System.out.println("***������������AK47���췽��");
		this.setName(name);
		this.setMaxBullet(maxBullet);
		this.setBulletUnit(unitBullet);
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

	Gun() {
		System.out.println("Gun�Ĺ��췽��Gun()");
	}

	private String name;// ����
	private int max_bullet;// ������
	private int bullet_unit; // ÿ�ο������ӵ�����
	int left_bullet; // ʣ���ӵ�����

	public void setMaxBullet(int num) {// ���õ����������
		max_bullet = num;
	}

	public int getMaxBullet() {
		return max_bullet;
	}

	public void setBulletUnit(int num) {
		bullet_unit = num;
	}

	public int getBulletUnit() {
		return bullet_unit;
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
		System.out.println(name + ",��󵯼�����" + max_bullet + "������ǰʣ���ӵ�" + left_bullet + "��,ÿ�δ��" + bullet_unit + "���ӵ�");
	}

	public void asmb() {
		return;
	}
}
