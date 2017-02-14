package class12.jessie.day2;

public class CapsConv {

	public static void main(String[] args) {
		int n = 23034;
		int unit = 10000;
		while (n > 0) {
			int temp = 0;
			temp = n / unit;
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
			n = n % unit;
			unit = unit / 10;
		}
	}
}
