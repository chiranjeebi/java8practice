package interfaceenhancement.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurance {
    public static void main(String[] args) {
        String str="he is a good boy is and he play football";
                String[] words=str.split(" ");
        Map<String,Integer> hm=new HashMap<>();
    for (String word:words){
        if (hm.containsKey(word)){
            hm.put(word,hm.get(word)+1); //
        }else {
            hm.put(word,1);
        }
    }
        System.out.println(hm);
    }
}
