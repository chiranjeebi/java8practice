package interfaceenhancement.javabasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteDuplicateElement {
    public static void main(String[] args) {
        int [] a={1,2,3,3,4,5,5,6,7,99,99};
        ArrayList<Integer> arrayList=new ArrayList<>(); //here define array
        for(int i:a){ //adding elemets to arraylist
            arrayList.add(i);
        }
        List<Integer> list=arrayList.stream().distinct().collect(Collectors.toList());  //with distinct method we remove
     System.out.println(list+"" +"after delete duplicate element");
     //distinct->Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.
        //The toList() method of Collectors Class is a static (class) method. It returns a Collector Interface that gathers the input data onto a new list.

    }
}

