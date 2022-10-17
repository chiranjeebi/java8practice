package interfaceenhancement.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class even {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(22);
        list.add(16);
        list.add(39);
        list.add(99);
        System.out.println(list); //array list insertion order must be preserved
        List<Integer> l =list.stream().filter(i->i%2==0).collect(Collectors.toList());//filter always going to take boolean condition by using predicate ,predicate is a boolean valued function
        List<Integer> list1 =list.stream().filter(i->i%2==1).collect(Collectors.toList());
        List<Integer> list2 =list.stream().map(i->i*2).collect(Collectors.toList());//for evey obj present inside stream ,i want to create  equvalent obj based on some funtion we go for map it is always going to take funtion as argument


        System.out.println(l +" even no");
        System.out.println(list1 +" odd no");
        System.out.println(list2 +" create equvalent collection object with multiply 2");

        //stream is a interface present inside collection
        //how to create a stream
        //Stream s=c.stream();
        //streams concepts use not only colletion
        //we can use array,group of values that method is stream.of()
    }


}
