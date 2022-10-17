package interfaceenhancement.stream;

public class TestPalin {
    public static void main(String[] args) {
        String s="madam";
        String rev=""; //empty
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);//concationation happen i.e i=4,m+
        }
        if (rev.equals(s)) //check it's equal or not
        {
            System.out.println("it is a palindrome String");

        } else {
    System.out.println("it's not a palindrome");
        }
    }
}
