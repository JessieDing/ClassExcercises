package d0227;

public class HmwkRev_SubSet {
	// ������*����*��һ�������������һ��������?
	public static void main(String[] args) {
		char[] a = new char[] { 'a', 'b', 'c', 'd', 'e' };
		char[] b = new char[] { 'b', 'c', 'd' };
		System.out.println("b��a����������");
		isSubset(a, b);
	}

	static void isSubset(char[] a, char[] b) {
		char[] c = new char[b.length];
		for (int i = 0; i < a.length; i++) {
			if (b[0] == a[i] && (a.length - i) >= b.length) {
				System.arraycopy(a, i, c, 0, b.length);
				break;
			}
		}
		boolean flag = true;
		for (int j = 0; j < b.length; j++) {
			if (b[j] != c[j]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("b��a��������");
		} else {
			System.out.println("b����a��������");
		}
	}
}
