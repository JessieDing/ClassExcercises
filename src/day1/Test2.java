package day1;

public class Test2 {
	public static void main(String[] args) {
		// 用户账户有1000元的余额
		// 年利率：2%
		// 实际存款期限：1年零20天
		// 计算利息

		// BigDecimal dBalance = new BigDecimal(1000.00); //余额
		// BigDecimal dYrInter = new BigDecimal(0.02);//银行年利率
		// BigDecimal day = new BigDecimal("360");//一年360天
		// BigDecimal usrDay = new BigDecimal("20");//用户的20天
		// BigDecimal dDayInter =
		// dYrInter.divide(day,6,BigDecimal.ROUND_UP);//银行天利率
		// BigDecimal usrYrInterest = dYrInter.multiply(dBalance);//用户一年所得利息金额
		// BigDecimal usrDayInter = dDayInter.multiply(usrDay);//用户20天所得利息金额
		// BigDecimal usrTolInter =
		// usrYrInterest.add(usrDayInter);//用户1年零20天所得利息
		// System.out.println(usrTolInter);

		double dBalance = 1000.00;
		double yInter = 0.02;
		double dInter = yInter / 360;
		double dInAmount = dBalance * dInter * 20;
		double yInAmount = dBalance * yInter;
		double tolAmount = yInAmount + dInAmount;
		System.out.println(tolAmount);

		System.out.println(0.02 * 1000 + 0.02 / 360 * 20 * 1000);

		// int a = 10;
		// int b = 4;
		// // 1.自增、自减
		// a++;
		// b--;
		// System.out.println(a);
		// System.out.println(b);
		// // 2.完整表达式
		// a = a + 2;
		// b = b * 4;
		// System.out.println(a);
		// System.out.println(b);
		// // 3.简写
		// a += 5; // a=a+5
		// b /= 2; // b=b/2
		//
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(b);

		// System.out.println("a+b=" + (a + b));
		// System.out.println("a-b=" + (a - b));
		// System.out.println("axb=" + a * b);
		// System.out.println("a/b=" + a / b);
		// System.out.println("a%b=" + a % b);
		//
		// System.out.println(a > b);
		// System.out.println(a < b);
		// System.out.println(a >= b);
		// System.out.println(a <= b);
		// System.out.println(a == b);
		// System.out.println(a != b);

		// System.out.println(true&&true);
		// System.out.println(true&&false);
		// System.out.println(true||false);
		// System.out.println(false||false);
		// System.out.println(true^false);
		// System.out.println(true^true);
		// System.out.println(false^false);
	}
}
