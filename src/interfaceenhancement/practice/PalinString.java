package interfaceenhancement.practice;

public class PalinString {
    public static void main(String[] args) {
        String str="madam";
        String rev="";
        for (int i= str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println(rev +"this is a plaindrome String");
        }
    }
}
