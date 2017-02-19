package class12.jessie.day4;

//冒泡排序，大的在后面
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 43, 2, 45, 67, 20, 11, 35, 78, 9, 52, 4 };
		System.out.println("排序之前数组为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 开始冒泡排序
		for (int i = 1; i < arr.length; i++) { // n个数，外层循环需要进行n-1趟
			for (int j = 0; j < arr.length - i; j++) { // 内层循环，两两比较n-i次
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("第" + i + "趟（外循环）排序结果：");
			for (int n = 0; n < arr.length; n++) {
				System.out.print(arr[n] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("冒泡最终结果：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
