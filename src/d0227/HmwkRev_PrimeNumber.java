package d0227;

public class HmwkRev_PrimeNumber {
	// ��1~1000֮�������
	// ����ֻ�ܱ�1������������
	// 1��������
	// 2��������Ψһ��һ��ż��
	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) {
				System.out.print(i + ",");
			}
		}

		// for (int i = 2; i <= 1000; i++) {
		// boolean flag = true;
		// for (int j = 2; j <= (i / 2); j++) {// ���ţ�j<=(int)(Math.sqrt(i))
		// if (i % j == 0) {
		// flag = false;
		// break;
		// }
		// }
		//
		// if (flag) { // i�޷���j����
		// System.out.println(i);
		// }
		// }
	}

	public static boolean isPrime(int i) {

		for (int j = 2; j <= (int) (Math.sqrt(i)); j++) {// ע����<=
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
