package class12.jessie.day5;

public class RemoveBlanc {
	public static char[] trim(char[] c) {
		char[] newArr = new char[c.length];
		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				System.arraycopy(c, i, newArr, j, 1);
				j++;
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		char[] arr = new char[] { '1', ' ', 'w', '3', 'd', ' ', ' ', ' ', ' ', 'y' };
		System.out.println("ԭ��������Ϊ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("ɾ���ո�������Ϊ��");
		System.out.println(trim(arr));
	}
}
