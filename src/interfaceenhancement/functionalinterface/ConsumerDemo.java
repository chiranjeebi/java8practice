package interfaceenhancement.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


    public static void main(String[] args) {

        Consumer<Integer> consumer = t -> {                             //lambda expression
                                      System.out.println("print : " + t);
                                         };

        List<Integer> list= Arrays.asList(1,2,3,4,5);

 consumer.accept(20);
 consumer.accept(3);
 consumer.accept(5);
    }
}