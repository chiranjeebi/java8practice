package interfaceenhancement.ex.recursion;

public class Palindromstrin {



    public static void main(String[] args) {
            String s = "madam";
            String reverse=new StringBuilder(s).reverse().toString();
            if(reverse==s){
                System.out.println("palindrome");
            }


    }
}
