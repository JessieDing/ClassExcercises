package day5;

public class Method {
	public void print(String message) {
		System.out.println(message);
	}

	public static int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		// print("��ӡ����");���� //��̬�������÷Ǿ�̬������ͨ������������
		Method method = new Method();
		method.print("��ӡ����");
		int x = 123;
		int y = 78;
		int z = 34;
		method.print(Integer.toString(max(x, y, z)));
	}
}
