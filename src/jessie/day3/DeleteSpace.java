package day3;

import java.util.Arrays;

//����
public class DeleteSpace {

	public static void main(String[] args) {
		// ��дһ�δ��룬ȥ���ַ����������еĿո�
		char[] arrChar = new char[] { 'a', 'b', ' ', '2', ' ', '+', '7', ' ', 'E' };
		System.out.println("�ַ�����ԭ����ʾΪ��");
		for (int i = 0; i < arrChar.length; i++) {
			System.out.print(arrChar[i]);
		}
		System.out.println();
		System.out.println("ȥ���ո����ʾΪ��");
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
