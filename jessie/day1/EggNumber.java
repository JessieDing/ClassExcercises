package class12.jessie.day1;

public class EggNumber {

	public static void main(String[] args) {

		for (int n = 1; n <= 10000; n++) {
			// if (n % 2 == 1 &&
			// n % 3 == 0 &&
			// n % 4 == 1 &&
			// n % 5 == 4 &&
			// n % 6 == 3 &&
			// n % 7 == 0 &&
			// n % 8 == 1 &&
			// n % 9 == 0) {
			// System.out.println(n);
			// }
//			if (n >= 9500) {
//				break;// 跳出整个for循环。。其实for循环可不必要这一句。
//			}
			if (n % 2 != 1)
				continue;// 终止本次for循环，进入下一轮循环
			if (n % 3 != 0)
				continue;
			if (n % 4 != 1)
				continue;
			if (n % 5 != 4)
				continue;
			if (n % 6 != 3)
				continue;
			if (n % 7 != 0)
				continue;
			if (n % 8 != 1)
				continue;
			if (n % 9 != 0)
				continue;
			System.out.println(n);
		}

	}

}
// 1个1个拿，正好拿完。
// 2个2个拿，还剩1个。
// 3个3个拿，正好拿完。
// 4个4个拿，还剩1个。
// 5个5个拿，还差1个。
// 6个6个拿，还剩3个。
// 7个7个拿，正好拿完。
// 8个8个拿，还剩1个。
// 9个9个拿，正好拿完。
// 问筐里最少有多少鸡蛋？