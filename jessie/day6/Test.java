package class12.jessie.day6;

public class Test {

	public static void main(String[] args) {
		// ��,��������˵��µľ������
		double f1 = 4.55;
		double f2 = 5.55;
		System.out.println(f1 * f2);
		// ������ֱ�ӱȽϲ����Ĵ���
		double b = 0.05 + 0.01;
		System.out.println(b == 0.06);
		System.out.println(0.05 + 0.01);
		// ��ȷ�ĸ������ȽϷ�ʽ
		boolean equ = false;
		if (Math.abs(0.06 - b) < 0.0000001) {// ��ľ���ֵС��ĳ����С��������ʾ���
			equ = true;
		} else {
			equ = false;
		}
		System.out.println(equ);
		Float a;// �������������float��ͬ
		a = Float.parseFloat("3.14159");
		System.out.println(a);

		// ����ת��ʾ��
		// byte nAge = 50;
		// int iAge = (int) nAge;// ��ȫ��ǿ������ת��
		// float fAmt = (float) 1000.00;// ǿ��ת������ֵ��ע��Խ��
		// double dAmt = fAmt;

		// fAmt = dAmt;// ��תС������

		// char cTmp = 53;// ���԰�����ֱֵ�Ӹ���char��
		// cTmp = (char) nAge;// �ȳ�����ת��

		// boolean bTmp = (boolean) 1;// �������ͽ�ֹת��

		// λ�����ʾ��
		Integer i = new Integer(128);
		Integer n = new Integer(129);
		System.out.println(i + ":" + Integer.toBinaryString(i));
		System.out.println(n + ":" + Integer.toBinaryString(n));

		System.out.println("i|n:" + Integer.toBinaryString(i | n));
		System.out.println("i&n:" + Integer.toBinaryString(i & n));
		System.out.println("~i:" + Integer.toBinaryString(~i));
		System.out.println("1^0:" + Integer.toBinaryString(1 ^ 0));
		System.out.println("1^1:" + Integer.toBinaryString(1 ^ 1));

	}

}
