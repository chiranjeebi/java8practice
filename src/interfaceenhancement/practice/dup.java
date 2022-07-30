package interfaceenhancement.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class dup {
    public static void main(String[] args) {
        int b[]={1,2,3,3,4,5,6,6,7,8,9};
        ArrayList arrayList=new ArrayList<>();
        for (int i:b){
            arrayList.add(i);
        }
        List<Integer> list= (List<Integer>) arrayList.stream().distinct().collect(Collectors.toList());

/*
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,3,4,5,6,7));
*//*
        List<Integer> list=arrayList.stream().distinct().collect(Collectors.toList());*/
System.out.println(list);

    }

}
