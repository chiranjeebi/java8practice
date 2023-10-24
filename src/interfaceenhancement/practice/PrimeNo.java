package interfaceenhancement.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(100);
        al.add(1);
        al.add(2);
        al.add(10);
        al.add(55);

        List<Integer> list=al.stream().filter(i->i%2==1).collect(Collectors.toList());
        System.out.println(list);

   }

}
