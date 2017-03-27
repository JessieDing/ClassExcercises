package d0227;

import java.util.Arrays;

public class HmwkRev_RemoveBlanc {
	// 编写一段代码，去除字符数组中所有的空格
	public static void main(String[] args) {
		char[] charArr = new char[] { 'a', ' ', ' ', ' ', 'd', 'f', ' ', 'D', ' ', 'e' };
		System.out.println("原来字符数组为：");
		System.out.println(Arrays.toString(charArr));
		char[] newCharArr = removeBlanc(charArr);
		System.out.println("删除空格后：");
		System.out.println(Arrays.toString(newCharArr));
	}

	public static char[] removeBlanc(char[] cArr) {
		int lens = cArr.length - cntBlanc(cArr);
		char[] newArr = new char[lens];
		int j = 0;
		for (int i = 0; i < cArr.length; i++) {// for(char i:arr){if(c=='') }
			if (cArr[i] != ' ') {
				newArr[j] = cArr[i];
				j++;
			}
		}
		return newArr;
	}

	public static int cntBlanc(char[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {// for(char i:arr){if(c=='') }

			if (arr[i] == ' ') {
				count++;
			}
		}
		return count;
	}
}
