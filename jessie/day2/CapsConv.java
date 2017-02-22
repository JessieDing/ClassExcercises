package class12.jessie.day2;

public class CapsConv {

	public static void main(String[] args) {
		// 分成两部分考虑，以万最高为例
		// 一部分为单个数字大写，万位用该数除10000，然后依次用10000、1000、100取余后，用数字除以单位取整
		// 一部分为单位，即个十百千万
		// 23034 % 10000 = 3034
		// 3034 % 1000 = 34
		int n = 23034;
		int unit = 10000;
		while (n > 0) {
			int temp = 0;
			temp = n / unit;
			switch (temp) {
			case 0:
				System.out.print("零");
				break;
			case 1:
				System.out.print("壹");
				break;
			case 2:
				System.out.print("贰");
				break;
			case 3:
				System.out.print("叁");
				break;
			case 4:
				System.out.print("肆");
				break;
			case 5:
				System.out.print("伍");
				break;
			case 6:
				System.out.print("陆");
				break;
			case 7:
				System.out.print("柒");
				break;
			case 8:
				System.out.print("捌");
				break;
			case 9:
				System.out.print("玖");
				break;
			}
			if (temp != 0) {
				switch (unit) {
				case 10000:
					System.out.print("万");
					break;
				case 1000:
					System.out.print("仟");
					break;
				case 100:
					System.out.print("佰");
					break;
				case 10:
					System.out.print("拾");
					break;
				}
			}
			n = n % unit;
			unit = unit / 10;
		}
	}
}
