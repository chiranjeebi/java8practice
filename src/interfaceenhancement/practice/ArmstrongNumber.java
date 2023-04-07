package interfaceenhancement.practice;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int no=123;
        int t1=no;
        int length=0;
        while(t1 != 0){
            length=length+1;
            t1=t1/10;
        }

    int t2=no;
        int arms=0;
        while(t2!=0){
            int mul=1;
            int rem=t2%10;
            for (int i=1;i<=length;i++){
                mul=mul*rem;
            }
            arms=arms+mul;
            t2=t2/10;
        }
        if (no==arms){
            System.out.println("it is a armstrong no");
        }else {
            System.out.println("not a armstorng no");
        }

    }


}
