package interfaceenhancement.stream.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


//using sorted () method

public class ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(20);
        arrayList.add(50);
        arrayList.add(2);
        arrayList.add(30);
        System.out.println(arrayList);

        List<Integer> l=arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("default sorting order :" +l );

        List<Integer> l2=arrayList.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("customized sorting order :" +l2); //decending order

        // -symbol used for reverse,in sorted() we have a method call compare to ().

        // processing by min(), max() value


        Integer min=arrayList.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("minimum value :" +min);

        Integer max=arrayList.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("maximum value :" +max);

        List<Integer> sortedList=arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList +"-> After soring the Array");

        List<Integer> acending=arrayList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(acending +"after reversing");




    }
}
