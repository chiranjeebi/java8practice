package interfaceenhancement.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class no {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(4);

        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int x:list){
            linkedList.add(x);
            for(int y:list1){
                linkedList.add(y);
            }
    }
    System.out.println(linkedList);
    }
}
