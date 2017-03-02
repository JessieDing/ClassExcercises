package class12.jessie.d0301;

public class WeaponTest {

	public static void main(String[] args) {
		HandGun gun = new HandGun("左轮手枪", 6, 1);
		gun.reload();
		gun.printInfo();
		// gun.asmb();
		// System.out.println("弹夹容量：" + gun.getMaxBullet());
		// gun.setGunName("Glock 17");
		// gun.setBulletUnit(1);
		// gun.setMaxBullet(17);
		// gun.reload();
		// gun.fire();
		// gun.printInfo();
		AK47 ak = new AK47("小弹夹AK47", 25, 3);
		ak.reload();
		ak.printInfo();
		AK47 ak1 = new AK47("大弹夹AK47", 30, 3);
		ak1.reload();
		ak1.printInfo();
		// ak.asmb();
		// ak.setGunName("AK47");
		// ak.setBulletUnit(3);
		// ak.setMaxBullet(30);
		// System.out.println("弹夹容量：" + ak.getMaxBullet());
		// ak.reload();
		// ak.rapidFire();
		// ak.printInfo();
	}
}

class HandGun extends Gun {
	HandGun() {// 不带参数的构造方法（构造器）
		System.out.println("***手枪构造方法");
		name = "Glock 17";
		max_bullet = 17;
		bullet_unit = 1;
	}

	HandGun(String name, int maxBullet, int unitBullet) {// 带参数的构造方法（构造器），方法的重载
		System.out.println("***带三个参数的手枪构造方法");
		this.name = name;
		max_bullet = maxBullet;
		bullet_unit = unitBullet;
	}

	public void asmb() {
		System.out.println("用手枪方式组装");
	}
}

class AK47 extends Gun {
	// 子类添加新的特征和行为
	AK47() {// 不带构造方法（构造器）
		System.out.println("***AK47构造方法");
		name = "AK47";
		max_bullet = 30;
		bullet_unit = 3;
	}

	AK47(String name, int maxBullet, int unitBullet) {// 带参数的构造方法（构造器），方法的重载
		System.out.println("***带三个参数的AK47构造方法");
		this.name = name;
		max_bullet = maxBullet;
		bullet_unit = unitBullet;
	}

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
	String name;// 名称
	int max_bullet;// 最大填弹量
	int left_bullet; // 剩余子弹数量
	int bullet_unit; // 每次开火打出子弹数量

	public void setMaxBullet(int num) {// 设置弹夹最大容量
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
		System.out.println(name + ",最大弹夹容量" + max_bullet + "发，当前剩余子弹" + left_bullet + "发,每次打出" + bullet_unit + "发子弹");
	}

	public void asmb() {
		return;
	}
}
