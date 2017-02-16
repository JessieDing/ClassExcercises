package class12.jessie.day3;

import java.util.Arrays;

public class CapsChangeInArrays {

	public static void main(String[] args) {
		char[] arrChar = new char[] { 'a', 'b', 'c', '2', '4', '+', '7', 'D', 'E' };
		for (int i = 0; i < arrChar.length; i++) {
			if (arrChar[i] >= 97 && arrChar[i] <= 122) {
				arrChar[i] -= 32;
			} else if (arrChar[i] >= 'A' && arrChar[i] <= 'Z') {
				arrChar[i] += 32;
			}
		}
		System.out.print(Arrays.toString(arrChar));
	}
}
