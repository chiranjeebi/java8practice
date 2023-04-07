package interfaceenhancement.predicate;

import java.util.function.Predicate;

public class test2 {
    public static void main(String[] args) {

        int x[]={10,20,29,50,5,6};

        Predicate<Integer> p1= i-> i>10;
        Predicate<Integer> p2=i-> i%2==0;

        System.out.println( "the number grater than 10 are :");
        m1(p1,x);

        System.out.println( "the even number are :");
        m1(p2,x);

        System.out.println( "the number not grater than 10 are :");
        m1(p1.negate(),x);

        System.out.println( "the number not grater than 10 and even no are :");
        m1(p1.and(p2),x);

        System.out.println( "the number grater than 10 and even no are :");
        m1(p1.or(p2),x);
    }
    public static void m1(Predicate<Integer> p,int []x) {  // m1 method having input predicate integer p and argument array
        for (int x1:x){
            if(p.test(x1))                //abstract method
                System.out.println(x1);
        }
    }
}
