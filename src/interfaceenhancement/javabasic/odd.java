package interfaceenhancement.javabasic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class odd {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(99);
        arrayList.add(77);
        arrayList.add(55);
        List<Integer> list= arrayList.stream().filter(i->i%2==1).collect(Collectors.toList());
        System.out.println(list);

    }

}
