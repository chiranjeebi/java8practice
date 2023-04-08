package interfaceenhancement.stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Chiranjeebi");
        arrayList.add("saumyashree");
        arrayList.add("rabi");
        arrayList.add("chavi");
        arrayList.add("venkatesh");
        arrayList.add("krishna");
        System.out.println(arrayList);

        //please find out whose name length greater than 9

        List<String> list = arrayList.stream().filter(s->s.length()>=9).collect(Collectors.toList());

        System.out.println(list + "  names whose length greater than 9 :");

        List<String> list1=arrayList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list1);

     long count=arrayList.stream().filter(s -> s.length()>=9).count();
     System.out.println(count + " the no of streams whose length is greater than >=9");



      //collect() is a method which collect element from stream and adding to the collection
        //count () method returns the number of element present in stream


    }
}
