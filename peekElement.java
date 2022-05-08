package DSA_ASS_6;

public class peekElement {
    public static void main(String[] args) {
        int[] a={1,2,3,5,4,17,1,19};
        if(a.length==1){
            System.out.println("0");
        }
        if(a[0]>=a[1]){
            System.out.println("0");
        }
        if(a[a.length-1]>=a[a.length-2]){
            System.out.println(a.length-1);
        }
        for(int i=1;i<a.length-1;i++){
            if(a[i]>=a[i-1] && a[i]>=a[i+1]){
                System.out.println(i);
            }
        }
    }
}
