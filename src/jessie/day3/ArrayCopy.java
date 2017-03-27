package day3;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        // int[] a = new int[] { 2, 8, 4, 3, 9 };
        // int[] b = new int[4];
        // System.arraycopy(a, 1, b, 1, 3);
        // for (int i = 0; i < b.length; i++) {
        // System.out.println(b[i]);
        // }
        int[] c = new int[]{2, 8, 4, 3, 9};
        int[] d = new int[5];
        d = Arrays.copyOf(c, 5);
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
