package interfaceenhancement.javabasic.collectionframework;


import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
        l.add("venky");
        l.add("rahul");
        l.add("kity");
        l.add(30);
        l.add("solution");
        l.set(0,"software");
        l.remove(1);
        l.addFirst("druga");
        l.addLast("HYD");
        System.out.println(l);
        //insertion order is preserved
        //hectrogenious obj is allowed



    }
}
