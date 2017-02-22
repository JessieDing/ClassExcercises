package class12.jessie.day6;

import java.util.Arrays;

public class PassByRefOrValue {

	public static void main(String[] args) {
		// 传值
		int n = 3456;
		testMethod1(n);
		System.out.println("main:" + n);
		// 传引用
		int[] arr = new int[] { 1, 2, 3, 4 };
		System.out.println("初始数组:" + Arrays.toString(arr));
		testMethod2(arr);
		System.out.println("调用后:" + Arrays.toString(arr));
	}

	public static void testMethod1(int n) {
		// 传值
		n = n * 2;
		System.out.println("testMethod1:" + n);
	}

	public static void testMethod2(int[] arrSrc) {
		// 传引用
		for (int i = 0; i < arrSrc.length; i++) {
			arrSrc[i] *= 2;
		}
	}

}
