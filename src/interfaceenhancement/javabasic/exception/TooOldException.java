package interfaceenhancement.javabasic.exception;

public class TooOldException extends RuntimeException {
    TooOldException(String message){
        //we use super() to make decription available to throwable class,so that throwable print stack trace method,defalut exception handeler.
    }
}
