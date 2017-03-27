package day6;

//丁洁
public class IntArray {
	// 定义一个整型数组，求最大值，最小值，平均值
	public static void main(String[] args) {
		int[] arr = new int[] { 90, 70, 4, 74, 13, 67, 20 };
		System.out.println("最大值：" + getMax(arr));
		System.out.println("最小值：" + getMin(arr));
		System.out.println("平均值：" + getAvg(arr));
	}

	// 最大值
	public static int getMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	// 最小值
	public static int getMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	// 平均值
	public static int getAvg(int[] a) {
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		avg = sum / a.length;
		return avg;
	}
}
