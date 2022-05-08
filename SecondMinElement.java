package DSA_ASS_6;

import DSA.Array;

import java.util.Arrays;
import java.util.List;

public class SecondMinElement {
    public static void main(String[] args) {
        int[] a={2,6,8,7,3,4,9,18,65};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
       System.out.println("seond minimum element is " +a[1]);
    }
}
