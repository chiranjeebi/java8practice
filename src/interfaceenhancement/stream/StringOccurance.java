package interfaceenhancement.stream;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
    public static void main(String[] args) {
        String str = "this this city is is very oldest oldest & capital also";

        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" "); //spilt by space

        for(String word :words) { //
            //for( each item x:target )
            // containsKey(key) will return a boolean value
            // true if it contains the key and false if it doesn't.
            if (hashMap.containsKey(word)) //
                hashMap.put(word, hashMap.get(word) + 1);

            else
                hashMap.put(word, 1); //
        }

        System.out.println(hashMap);

    }

}
