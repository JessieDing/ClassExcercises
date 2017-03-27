package day4;

//Josephus problem 约瑟夫环
public class Three {

    public static void main(String[] args) {
        boolean[] arr = new boolean[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true; // 初始全赋为true
        }

        int index = 0; // 编号
        int count = 0; // 报数器
        int leftNo = arr.length; // 剩余true的个数

        while (leftNo > 2) {
            if (arr[index] == true) {
                count++;
                if (count == 3) { // 报到3时
                    arr[index] = false;
                    count = 0; // 重新由1开始报数
                    leftNo--;
                }
            }
            index++; // 下一个继续
            if (index == arr.length) {
                index = 0; // 不能超出数组长度
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