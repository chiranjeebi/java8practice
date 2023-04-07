package interfaceenhancement.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(100);

        List<Integer> list=al.stream().filter(i->i%2==1).collect(Collectors.toList());
        System.out.println(list);


    }

}
