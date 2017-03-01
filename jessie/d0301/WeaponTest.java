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
		System.out.println("用手枪方式组装");
	}
}

class AK47 extends Gun {
	// 子类添加新的特征和行为
	public void rapidFire() { // 连发
		int n = 0;
		while (left_bullet > 0) {
			n++;
			System.out.println("第" + n + "次连发");
			fire();
		}
	}

	public void asmb() {
		System.out.println("用AK47方式组装");
	}
}

class Gun {
	private String name;// 名称
	int max_bullet;// 最大填弹量
	int left_bullet; // 剩余子弹数量
	int bullet_unit; // 每次开火打出子弹数量

	public void setMaxBullet(int num) {// 设置弹夹最大容量
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
		if (left_bullet <= 0) {// 当前弹夹无子弹，不开火
			return;
		}
		System.out.println("shooting!子弹减少" + bullet_unit + "发。对方生命值减少！");
		if (left_bullet > bullet_unit) {
			left_bullet -= bullet_unit;// 当前剩余子弹，在原数量上减去每次开火减少的数量
		} else {
			left_bullet = 0;
		}
	}

	public void reload() {
		left_bullet = max_bullet;
		System.out.println("完成装弹，当前子弹量：" + left_bullet);
	}

	public void printInfo() {
		System.out.println(name + ",最大弹夹容量" + max_bullet + "发，当前剩余子弹" + left_bullet + "发");
	}

	public void asmb() {
		return;
	}
}
