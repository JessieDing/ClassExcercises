package d0227;

public class HmwkRev_PrimeNumber {
	// 求1~1000之间的质数
	// 质数只能被1和他本身整除
	// 1不是质数
	// 2是质数中唯一的一个偶数
	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) {
				System.out.print(i + ",");
			}
		}

		// for (int i = 2; i <= 1000; i++) {
		// boolean flag = true;
		// for (int j = 2; j <= (i / 2); j++) {// 最优：j<=(int)(Math.sqrt(i))
		// if (i % j == 0) {
		// flag = false;
		// break;
		// }
		// }
		//
		// if (flag) { // i无法被j整除
		// System.out.println(i);
		// }
		// }
	}

	public static boolean isPrime(int i) {

		for (int j = 2; j <= (int) (Math.sqrt(i)); j++) {// 注意是<=
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
