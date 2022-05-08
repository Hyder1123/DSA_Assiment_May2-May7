package DSA_ASS_6;

import java.util.Arrays;

public class FindSquarAndSort {
    public static void main(String[] args) {
        int[] a = {-6, -3, -1, 2, 4, 5};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
