package interfaceenhancement.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        int[] numbers={10,20,33,44,55,77};
        Predicate<Integer> oddEvenPredicate= num->num%2 !=0; //using lambda expression
        for(Integer num: numbers){
            if (oddEvenPredicate.test(num)){
                System.out.println( num + " odd no");
            }
        }
    }
}
