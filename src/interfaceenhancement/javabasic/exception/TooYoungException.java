package interfaceenhancement.javabasic.exception;

public class TooYoungException extends RuntimeException {
     TooYoungException(String message){
   super(message);   //we use super() to make decription available to throwable class,so that throwable print stack trace method,defalut exception handler.
    }
}
