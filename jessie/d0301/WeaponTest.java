package class12.jessie.d0301;

public class WeaponTest {

	public static void main(String[] args) {
		HandGun gun = new HandGun();
		gun.setGunName("Glock 17");
		gun.setBulletUnit(1);
		gun.setMaxBullet(17);
		gun.reload();
		gun.fire();
		gun.printInfo();
		AK47 ak = new AK47();
		ak.setGunName("AK47");
		ak.setBulletUnit(3);
		ak.setMaxBullet(30);
		ak.reload();
		ak.fire();
		ak.printInfo();
	}
}

class HandGun extends Gun {

}

class AK47 extends Gun {

}

class Gun {
	String name;// 名称
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

	public void fire() {
		if (left_bullet <= 0) {
			return;
		}
		System.out.println("啪！子弹减少" + bullet_unit + "发。对方生命值-40");
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

}
