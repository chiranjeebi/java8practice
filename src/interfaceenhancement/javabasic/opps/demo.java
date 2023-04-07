package interfaceenhancement.javabasic.opps;

import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        String str="ccckkk";   //objects created
        char[] arr=str.toCharArray();   //convrting to array
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (hashMap.get(arr[i])==null){
                hashMap.put(arr[i],1);
            }
            else{
                int count= hashMap.get(arr[i]);
                hashMap.put(arr[i],++count);
            }
        }
        System.out.println(hashMap);
    }
}
