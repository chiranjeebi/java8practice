package interfaceenhancement.ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class hash {

    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(1,"Alex");
        map.put(2,"jhon");
        map.put(3,"goku");
        map.put(4,"kane");

        System.out.println(map);

        map.entrySet();
        System.out.println(map+"entryset");

        Collection c=map.values();
        System.out.println(c + "values");

        Collection k=map.keySet();
        System.out.println(k  +"keyset");


        Map<String, Integer> m = new HashMap<>();
        map.put("A", 1);

        Stream<String> keyStream = m.keySet().stream();
        Stream<Integer> valStream = m.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = m.entrySet().stream();


    }
}
