package class12.jessie.day5;

public class AreaCal {
	// ��Բ�������
	public static double findRoundArea(double r) {
		double area = 0.00F;
		area = Math.round(3.14 * r * r);
		return area;
	}

	// ������������
	public static double findRectArea(double l, double w) {
		double area = 0.00F;
		area = Math.round(l * w);
		return area;
	}

	public static void main(String[] args) {
		double radi = 10.2; // Բ�뾶
		double lgh = 7.5; // ���γ�
		double wdt = 14; // ���ο�

		// double RoundArea = findArea(radi);
		// double RectagleArea = findRectArea(lgh, wdt);

		System.out.println("�뾶" + radi + "��Բ���Ϊ��" + findRoundArea(radi));
		System.out.println("��" + lgh + "����" + wdt + "�ľ������Ϊ��" + findRectArea(lgh, wdt));

	}
}
