package interfaceenhancement.ex.recursion;

import java.util.HashSet;

public class RemoveDuplicateNo {
    public static void main(String[] args) {
        int a[]={1,2,3,3,4,4,5,5};

        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<a.length;i++){
            hashSet.add(a[i]);
        }
        for (int no:hashSet){
            System.out.println(  hashSet +"After removing duplicate no in an array ");
            break;
        }


    }
}
