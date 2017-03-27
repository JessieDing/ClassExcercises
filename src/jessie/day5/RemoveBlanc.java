package day5;

import java.util.Arrays;

public class RemoveBlanc {
	public static char[] trim(char[] c) {
		int lens = c.length - cntSpaceNum(c);
		char[] newArr = new char[lens];
		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				newArr[j] = c[i];
				// System.arraycopy(c, i, newArr, j, 1);
				j++;
			}
		}
		return newArr;
	}

	public static int cntSpaceNum(char[] a) {
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				num++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		char[] arr = new char[] { '1', ' ', 'w', '3', 'd', ' ', ' ', ' ', ' ', 'y' };
		System.out.println("原来的数组为：");
		System.out.println(Arrays.toString(arr));
		System.out.println("删除空格后的数组为：");
		System.out.println(Arrays.toString(trim(arr)));

	}
}
