package class12.jessie.day5;

public class Test {

	public static void main(String[] args) {
		double amt1 = 5000.00;
		double amt2 = 300000.00;
		double amt3 = 2000000.00;

		System.out.println("�˻�622345000000001������" + getFee(amt1));
		System.out.println("�˻�622345000000002������" + getFee(amt2));
		System.out.println("�˻�622345000000003������" + getFee(amt3));
	}

	public static double getRate(double amt) {
		double rate = 0.00F;
		if (amt <= 10000) {
			rate = 2.00 / 100;// 2/100�����������ͣ������Ϊ���ͣ��ٸ���rate����Ȼ������
			return rate;
		} else if (amt <= 1000000) {
			rate = 1.00 / 100;
			return rate;
		} else {
			rate = 0.75 / 100;// 0.75/100 һ����double����������Ϊdouble
			return rate;
		}
	}

	public static double getFee(double amount) {
		double fee = 0.00F;
		fee = Math.round(amount * getRate(amount));
		return fee;
	}
}
