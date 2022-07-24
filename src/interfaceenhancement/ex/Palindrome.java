package interfaceenhancement.ex;

public class Palindrome {
    public static void main(String[] args) {
        String s="wow";          //palindrome word
    String rev="";              //empty reverse value
    int length=s.length();       //check string length
    for (int i=length-1;i>=0;i--){
        rev=rev+s.charAt(i);
    }
   if (s.equals(rev)){
       System.out.println("palindrome");
   }
   else {
       System.out.println("not a palindrome");
   }
    }
}
