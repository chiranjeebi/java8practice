package interfaceenhancement.practice;

import java.sql.SQLOutput;

public class ReverseNo {
    public static void main(String[] args) {
        int rev=0;
        int rem;
        int no=3456;
        while(no !=0){
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println(rev);
    }


}
