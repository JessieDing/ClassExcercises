package day4;

//Josephus problem Լɪ��
public class Three {

    public static void main(String[] args) {
        boolean[] arr = new boolean[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true; // ��ʼȫ��Ϊtrue
        }

        int index = 0; // ���
        int count = 0; // ������
        int leftNo = arr.length; // ʣ��true�ĸ���

        while (leftNo > 2) {
            if (arr[index] == true) {
                count++;
                if (count == 3) { // ����3ʱ
                    arr[index] = false;
                    count = 0; // ������1��ʼ����
                    leftNo--;
                }
            }
            index++; // ��һ������
            if (index == arr.length) {
                index = 0; // ���ܳ������鳤��
            }
        }
        System.out.println("ʣ��������");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.print((i + 1) + " ");
            }
        }

    }
}