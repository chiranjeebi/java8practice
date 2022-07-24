package interfaceenhancement.stream;

public class palind {

    public static boolean isPalindrome(String orginalString){

        String reverse="";
        int length=orginalString.length(); //return 5
        for(int i=length-1;i>=0;i--)   // return 4 at first ,4>=0,4--
            reverse=reverse+orginalString.charAt(i); //concatination happen here  charecter at i'th index will return
        return orginalString.equals(reverse);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("lucky"));
        System.out.println(isPalindrome("madam"));


    }
}
