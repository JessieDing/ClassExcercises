package class12.jessie.day2;

public class CapsConv {

	public static void main(String[] args) {
		// �ֳ������ֿ��ǣ��������Ϊ��
		// һ����Ϊ�������ִ�д����λ�ø�����10000��Ȼ��������10000��1000��100ȡ��������ֳ��Ե�λȡ��
		// һ����Ϊ��λ������ʮ��ǧ��
		// 23034 % 10000 = 3034
		// 3034 % 1000 = 34
		int n = 23034;
		int unit = 10000;
		while (n > 0) {
			int temp = 0;
			temp = n / unit;
			switch (temp) {
			case 0:
				System.out.print("��");
				break;
			case 1:
				System.out.print("Ҽ");
				break;
			case 2:
				System.out.print("��");
				break;
			case 3:
				System.out.print("��");
				break;
			case 4:
				System.out.print("��");
				break;
			case 5:
				System.out.print("��");
				break;
			case 6:
				System.out.print("½");
				break;
			case 7:
				System.out.print("��");
				break;
			case 8:
				System.out.print("��");
				break;
			case 9:
				System.out.print("��");
				break;
			}
			if (temp != 0) {
				switch (unit) {
				case 10000:
					System.out.print("��");
					break;
				case 1000:
					System.out.print("Ǫ");
					break;
				case 100:
					System.out.print("��");
					break;
				case 10:
					System.out.print("ʰ");
					break;
				}
			}
			n = n % unit;
			unit = unit / 10;
		}
	}
}
