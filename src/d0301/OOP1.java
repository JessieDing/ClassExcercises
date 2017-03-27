package d0301;

public class OOP1 {

	public static void main(String[] args) {
		// MobilePhone myPhone = new MobilePhone();// 实例化一个对象
		// myPhone.sendMsg("你好");// 调用对象的发短信方法
		// myPhone.call();// 调用打电话方法
		// myPhone.internet();// 调用上网方法

		Circle myCircle = new Circle();
		myCircle.setRadius(12.00);
		double area = myCircle.findArea();
		double circum = myCircle.findCircum();
		System.out.println("圆的面积为：" + area);
		System.out.println("圆的周长为：" + circum);
	}
}

class Circle {
	double radius;
	double area;
	double circumference;

	public void setRadius(double r) {
		radius = r;
	}

	public double findArea() { // 公开方法，类行为的接口
		area = 3.14 * radius * radius;
		return area;
	}

	public double findCircum() {
		circumference = 2.00 * 3.14 * radius;
		return circumference;
	}
}

class MobilePhone {
	// 属性
	String id; // ID号
	double screenSize; // 屏幕尺寸
	String cpuType; // CPU尺寸
	int memeorySize; // 内存大小

	public void call() { // 打电话方法
		System.out.println("拨电话");
		System.out.println("通话");
		System.out.println("挂电话");
	}

	public void sendMsg(String strMsg) { // 发短信
		System.out.println("发短信...");
		System.out.println("您要发送的短信是：" + strMsg);
		System.out.println("发送成功");
	}

	public void internet() { // 上网
		System.out.println("连接Internet成功");
		System.out.println("传输数据");
	}
}
