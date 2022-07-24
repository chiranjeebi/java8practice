package interfaceenhancement.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
//        Integer a[]={1,2,2,3,4};
//        Integer del;
//        for (Integer i=0;i<=a.length;i++){
//            for (Integer j=i+1;j<=a.length;j++){
//            }
//        }
               //using java 8
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(1,2,3,4,4,5,6,6));
        System.out.println(arrayList);
        List<Integer> list=arrayList.stream().distinct().collect(Collectors.toList());     //Use steam’s distinct() method which returns a stream consisting of the distinct elements comparing by object’s equals() method.
                                                                                           //Collect all district elements as List using Collectors.toList()
        System.out.println(list +"" +"  remove duplicate element  in an Array");


    }


}
