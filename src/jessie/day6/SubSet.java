package day6;

//����
//дһ���㷨���ж�һ�������Ƿ�����һ�������������
//�磺����1{'a','b','c','d'},����2Ϊ{'b','c','d'}
//��2Ϊ1��������
public class SubSet {

	public static void main(String[] args) {
		char[] a = new char[] { 'a', 'b', 'c', 'd' };
		char[] b = new char[] { 'b', 'c', 'd' };
		System.out.println("b��a����������");
		isSubset(a, b);
	}

	public static void isSubset(char[] a, char[] b) {
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
					count++;
				}
			}
		}
		if (count >= b.length) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}
	}
}
