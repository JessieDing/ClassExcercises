package d0227;

import java.util.Arrays;

public class HmwkRev_RemoveBlanc {
	// ��дһ�δ��룬ȥ���ַ����������еĿո�
	public static void main(String[] args) {
		char[] charArr = new char[] { 'a', ' ', ' ', ' ', 'd', 'f', ' ', 'D', ' ', 'e' };
		System.out.println("ԭ���ַ�����Ϊ��");
		System.out.println(Arrays.toString(charArr));
		char[] newCharArr = removeBlanc(charArr);
		System.out.println("ɾ���ո��");
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
