package day1;

public class Test2 {
	public static void main(String[] args) {
		// �û��˻���1000Ԫ�����
		// �����ʣ�2%
		// ʵ�ʴ�����ޣ�1����20��
		// ������Ϣ

		// BigDecimal dBalance = new BigDecimal(1000.00); //���
		// BigDecimal dYrInter = new BigDecimal(0.02);//����������
		// BigDecimal day = new BigDecimal("360");//һ��360��
		// BigDecimal usrDay = new BigDecimal("20");//�û���20��
		// BigDecimal dDayInter =
		// dYrInter.divide(day,6,BigDecimal.ROUND_UP);//����������
		// BigDecimal usrYrInterest = dYrInter.multiply(dBalance);//�û�һ��������Ϣ���
		// BigDecimal usrDayInter = dDayInter.multiply(usrDay);//�û�20��������Ϣ���
		// BigDecimal usrTolInter =
		// usrYrInterest.add(usrDayInter);//�û�1����20��������Ϣ
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
		// // 1.�������Լ�
		// a++;
		// b--;
		// System.out.println(a);
		// System.out.println(b);
		// // 2.�������ʽ
		// a = a + 2;
		// b = b * 4;
		// System.out.println(a);
		// System.out.println(b);
		// // 3.��д
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
