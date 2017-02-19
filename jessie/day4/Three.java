package class12.jessie.day4;

public class Three {

	public static void main(String[] args) {
		boolean[] arr = new boolean[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}

		int index = 0; // 编号
		int count = 0; // 报数器
		int leftNo = arr.length; // 剩余个数，初始为总数

		while (leftNo > 2) {
			if (arr[index] == true) {
				count++;
				if (count == 3) { // 报到3时
					arr[index] = false;
					count = 0; // 重新由1开始报数
					leftNo--; // 将报3的剔除
				}
			}
			index++; // 下一个继续报数
			if (index == arr.length) { // 最后一个
				index = 0;
			}
		}
		System.out.println("剩余两个：");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				System.out.print((i + 1) + " ");
			}
		}

	}
}