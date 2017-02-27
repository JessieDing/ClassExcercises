package class12.jessie.d0227;

import java.util.Scanner;

//企业发放的奖金根据利润提成。
//利润(I)低于或等于10万元时，奖金可提10%；
// 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
// 20万到40万之间时，高于20万元的部分，可提成5%；
// 40万到60万之间时高于40万元的部分，可提成3%；
// 60万到100万之间时，高于60万元的部分，可提成1.5%。
//高于100万元时，超过100万元的部分按1%提成，
// 从键盘输入当月利润I，求应发放奖金总数？
public class HmwkRev_Bonus {
	public static void main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入当月利润：");
		double i = scan.nextDouble();
		System.out.println("应发奖金总数为：" + calcBonus(i));
		scan.close();
	}

	public static double calcBonus(double margin) {
		double temp = 0;
		double bonus = 0;
		if (margin > 1000000) {
			temp = margin - 1000000.00;// 1百万以上参与计算部分
			bonus += (temp * 0.10);
			margin -= temp;// 减掉已经计算的部分
		}
		if (margin > 600000) {
			temp = margin - 600000.00;// 六十万至1百万参与计算部分
			bonus += (temp * 0.015);
			margin -= temp;
		}
		if (margin > 400000) {
			temp = margin - 400000.00;
			bonus += (temp * 0.03);
			margin -= temp;
		}
		if (margin > 200000) {
			temp = margin - 200000.00;
			bonus += (temp * 0.05);
			margin -= temp;
		}
		if (margin > 100000) {
			temp = margin - 100000.00;
			bonus += (temp * 0.075);
			margin -= temp;
		}
		bonus += (margin * 0.10);
		return bonus;
	}

}
