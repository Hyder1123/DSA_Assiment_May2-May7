package DSA_ASS_6;

import java.util.Arrays;

public class SumOfUniqeElements {
    public static void main(String[] args) {
        //int[] a={1,2,3,2};
        //int[] a={1,1,1,1,1};
        int[] a={1,2,3,4,5};
        int Sum=FindUniqe(a);
        System.out.println(Sum);
    }

    /*private static int FindUniqe(int[] a) {
        int sum=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==1){
                sum+=a[i];
               // return sum;
            }
        }
        return sum;
    }*/

    private static int FindUniqe(int[] a) {
        Arrays.sort(a);
        int i=0;
        int j=1;

        int sum=0;
        while(i<a.length && j<a.length){
            if(a[i]!=a[j]){
                sum=sum+a[i];
                System.out.println(a[i]+" "+a[j]+" "+sum);


            }
            i++;
            j++;


        }
        //sum=sum+a[i];
       // System.out.println(sum);
        return sum;
    }

    /*private static void FindUniqe(int[] a) {
        int i=0;
        int j=3;
        int sum=0;
        while(i<j){
            if(a[i]!=a[j]){
                sum=a[i]+a[j];
                System.out.println(sum);
            }
            i++;
            j++;
        }

        //return sum;
    }*/
}
