package day3;

public class ArrayPractice {

	public static void main(String[] args) {
		// 遍历int型数组
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 定义一个数组，赋值，然后每个值放大十倍
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			a[i] = a[i] * 10;// 等价于a[i]*=10
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// 逆向遍历
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		 //打印出char型数组中的数字
		char[] arrChar = new char[] { 'a', 'b', 'c', '2', '4', '+', 'z' };
		 System.out.println("打印出字符数组中的数字：");
		 int count = 0;
		 for (int i = 0; i < arrChar.length; i++) {
		 if (Character.isDigit(arrChar[i])) { // if(arr[i]>='0'&&arr[i]<='9')		                                    
		 // 或者利用ASCII码：if(arr[i]>= && arr[i]<=)
		 System.out.print(arrChar[i] + " ");
		 count++;
		 }
		 }
		 System.out.println();
		 System.out.println("字符数组中的数字个数：");
		 System.out.println(count);
	

		// //输出三行四列且所有元素都是0的矩阵（二维数组遍历）
		// int[][] a = new int[3][4];
		// for (int i = 0; i < a.length; i++) {
		// for (int j = 0; j < a[i].length; j++) {
		// System.out.print(a[i][j] + " ");
		// }
		// System.out.println(); //打印一行后换行
		// }

		// // 一维数组遍历
		// int[] arrWeek = { 1, 2, 3, 4, 5, 6, 7 };
		// for (int i = 0; i < arrWeek.length; i++) {
		// System.out.print(arrWeek[i] + " ");
		// }
		// System.out.println();
		// System.out.println("逆向遍历：");
		// // 逆向遍历一维数组
		// for (int j = arrWeek.length - 1; j >= 0; j--) {
		// System.out.print(arrWeek[j] + " ");
		// }
	}
}
