package DSA_ASS_6;

public class FrequenyOfString {
    public static void main(String[] args) {
        String[] str={"India","Australia","India","Japan"};
        int visited=-1;
        String[] frq=new String[str.length];
        for(int i=0;i<str.length;i++){

            int count=1;
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])) {
                    count++;

                    System.out.println(str[i]+" "+count);
                }
            }
        }

    }
}
