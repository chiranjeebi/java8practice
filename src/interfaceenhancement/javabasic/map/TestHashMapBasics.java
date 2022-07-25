package interfaceenhancement.javabasic.map;

import java.util.*;

public class TestHashMapBasics {
    public static void main(String[] args) {

        // diff between hashmap & linked hashmap
        HashMap m=new HashMap<>();
        m.put("jane",101);
        m.put("alex",102);
        m.put("ravi",103);
        m.put("dev",104);
        m.put("surya",105);
        System.out.println(m+""+" Example of Hashmap"); //insertion is based on hashcode of keys & insertion is not preserved
        HashMap m1=new LinkedHashMap();
        m1.put("jane",101);
        m1.put("alex",102);
        m1.put("ravi",103);
        m1.put("dev",104);
        m1.put("surya",105);
        System.out.print(m1+""+" Example of Linked Hashmap");//insertion order is preserved in LinkedHashmap

          Set s= m.keySet();
          System.out.println(s);//keys will print
          boolean d=m.containsKey("101");
        Collection c=m.values();
        System.out.println(c);
        // ==&.equal() difference
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        System.out.println(i1==i2);  //==->is meant for reference comparison
        System.out.println(i1.equals(i2)); //.equals() meant for content comparison
    }
}
