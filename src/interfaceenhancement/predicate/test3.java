package interfaceenhancement.predicate;

import java.util.function.Predicate;


// Program to display names starts with K by using Predicate

public class test3 {
    public static void main(String[] args) {
        String[] names={"rina","chiny","krishna","kailash"};
        Predicate<String> startswithK= s-> s.charAt(0)=='k';
        for (String s:names){
            if (startswithK.test(s)){
                System.out.println(s);
            }
        }
    }
}
