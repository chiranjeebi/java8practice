package interfaceenhancement.javabasic.exception;

public class CustomException {
    public static void main(String[] args) {
        int age=20;
        if (age>60){
            throw new TooYoungException("plz wait some more time");

        }else if (age<18){
            throw new TooOldException("no chance of getting marriage");
        }else {
            System.out.println("thanks for registration ,u getting match details in email");
        }
    }

}
