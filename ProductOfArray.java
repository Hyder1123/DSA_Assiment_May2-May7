package DSA_ASS_6;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] a={10,3,5,6,2};
        int[] p=new int[a.length];
        p[0]=1;
        for(int i=1;i<a.length;i++){
            p[i]=p[i-1]*a[i-1];
        }
        int right=1;
        for(int i=a.length-1;i>=0;i--){
            p[i]=p[i]*right;
            right=right*a[i];
        }
        System.out.println(Arrays.toString(p));

    }
}
