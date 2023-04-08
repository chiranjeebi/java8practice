package interfaceenhancement.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;


// predicate Example to Remove null values and Empty String from the given List

public class test4 {
    public static void main(String[] args) {
        String [] names={"lucky","","druga","","suresh"};

        Predicate<String> stringPredicate= s->s!=null && s.length()!=0;   //using predicate
        ArrayList<String> arrayList=new ArrayList<>();
        for (String s:names){
            if (stringPredicate.test(s)){
                arrayList.add(s);
            }
        }
        System.out.println("the list of valid strings :");
        System.out.println(arrayList);


    }
}
