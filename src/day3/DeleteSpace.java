package day3;

import java.util.Arrays;

//丁洁
public class DeleteSpace {

	public static void main(String[] args) {
		// 编写一段代码，去除字符数组中所有的空格
		char[] arrChar = new char[] { 'a', 'b', ' ', '2', ' ', '+', '7', ' ', 'E' };
		System.out.println("字符数组原来显示为：");
		for (int i = 0; i < arrChar.length; i++) {
			System.out.print(arrChar[i]);
		}
		System.out.println();
		System.out.println("去除空格后显示为：");
		int count = 0;
		for (int i = 0; i < arrChar.length; i++) {
			if (arrChar[i] == 32) {
				count++;
				for (int j = i; j < arrChar.length - 1; j++) {
					arrChar[j] = arrChar[j + 1];
				}
			}
		}
		char[] newArr;
		newArr = Arrays.copyOf(arrChar, arrChar.length - count);
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);
		}
	}
}
