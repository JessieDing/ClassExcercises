package class12.jessie.day5;

public class AreaCal {
	// 求圆面积方法
	public static double findRoundArea(double r) {
		double area = 0.00F;
		area = Math.round(3.14 * r * r);
		return area;
	}

	// 求矩形面积方法
	public static double findRectArea(double l, double w) {
		double area = 0.00F;
		area = Math.round(l * w);
		return area;
	}

	public static void main(String[] args) {
		double radi = 10.2; // 圆半径
		double lgh = 7.5; // 矩形长
		double wdt = 14; // 矩形宽

		// double RoundArea = findArea(radi);
		// double RectagleArea = findRectArea(lgh, wdt);

		System.out.println("半径" + radi + "的圆面积为：" + findRoundArea(radi));
		System.out.println("长" + lgh + "，宽" + wdt + "的矩形面积为：" + findRectArea(lgh, wdt));

	}
}
