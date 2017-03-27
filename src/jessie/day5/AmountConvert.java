package day5;

import java.util.Scanner;

public class AmountConvert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÐ¡Ð´½ð¶î£¨ÕûÊý£©£º");
		int amount = scan.nextInt();
		System.out.print("×ª»»Îª´óÐ´½ð¶î£º");
		convert(amount);
		scan.close();
	}

	public static void convert(Integer lowerAmount) {
		int unit = (int) Math.pow(10, lowerAmount.toString().length());
		while (lowerAmount / unit == 0) {
			unit = unit / 10;
		}
		while (lowerAmount > 0) {
			int temp = 0;
			temp = lowerAmount / unit;
			switch (temp) {
			case 0:
				System.out.print("Áã");
				break;
			case 1:
				System.out.print("Ò¼");
				break;
			case 2:
				System.out.print("·¡");

				break;
			case 3:
				System.out.print("Èþ");
				break;

			case 4:
				System.out.print("ËÁ");
				break;

			case 5:
				System.out.print("Îé");
				break;

			case 6:
				System.out.print("Â½");
				break;

			case 7:
				System.out.print("Æâ");
				break;

			case 8:
				System.out.print("°Æ");
				break;

			case 9:
				System.out.print("¾Á");
				break;

			}
			if (temp != 0) {
				switch (unit) {
				case 10000:
					System.out.print("Íò");
					break;

				case 1000:
					System.out.print("Çª");
					break;

				case 100:
					System.out.print("°Û");
					break;

				case 10:
					System.out.print("Ê°");
					break;

				}
			}
			lowerAmount = lowerAmount % unit;
			unit = unit / 10;
		}
	}
}
