package day6;

//����
public class IntArray {
	// ����һ���������飬�����ֵ����Сֵ��ƽ��ֵ
	public static void main(String[] args) {
		int[] arr = new int[] { 90, 70, 4, 74, 13, 67, 20 };
		System.out.println("���ֵ��" + getMax(arr));
		System.out.println("��Сֵ��" + getMin(arr));
		System.out.println("ƽ��ֵ��" + getAvg(arr));
	}

	// ���ֵ
	public static int getMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	// ��Сֵ
	public static int getMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	// ƽ��ֵ
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
