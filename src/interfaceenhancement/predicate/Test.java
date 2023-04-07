package interfaceenhancement.predicate;

import org.omg.Messaging.SyncScopeHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<String> p= s -> s.length()>5;
        System.out.println(p.test("abcdef")); // true
        System.out.println(p.test("abcd"));   //false

   Predicate<Collection> predicate=collection -> collection.isEmpty();
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("A");
        System.out.println(predicate.test(arrayList)); //false
        ArrayList<String> a =new ArrayList<>();
        System.out.println(predicate.test(a));




    }
 // predicate is boolean value function
    //in our programing to check a particular condition we go for predicate
}
