package class12.jessie.day6;

//丁洁
public class Prime {
	// 1~1000之间的质数
	// 质数只能被1和他本身整除。1不是质数。
	public static void main(String[] args) {
		System.out.println("1~1000内的质数：");
		int count = 0;
		for (int i = 2; i <= 1000; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {// 非质数
					count++;
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("1~1000内共有" + (999 - count) + "个质数");// 1不是质数
	}
}
