package class12.jessie.day5;

public class Test {

	public static void main(String[] args) {
		double amt1 = 5000.00;
		double amt2 = 300000.00;
		double amt3 = 2000000.00;

		System.out.println("账户622345000000001手续费" + getFee(amt1));
		System.out.println("账户622345000000002手续费" + getFee(amt2));
		System.out.println("账户622345000000003手续费" + getFee(amt3));
	}

	public static double getRate(double amt) {
		double rate = 0.00F;
		if (amt <= 10000) {
			rate = 2.00 / 100;// 2/100两个都是整型，算出来为整型，再赋给rate，依然是整型
			return rate;
		} else if (amt <= 1000000) {
			rate = 1.00 / 100;
			return rate;
		} else {
			rate = 0.75 / 100;// 0.75/100 一个是double，算出来结果为double
			return rate;
		}
	}

	public static double getFee(double amount) {
		double fee = 0.00F;
		fee = Math.round(amount * getRate(amount));
		return fee;
	}
}
