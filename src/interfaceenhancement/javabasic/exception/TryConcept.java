package interfaceenhancement.javabasic.exception;

public class TryConcept {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);  //try with multiple catch block is recomanded
        }
        catch (ArithmeticException e){  //the order of catch block should be child to parent (top to bottom) ->child
            System.out.println("Arithmatic exception occurred");
        }
        catch (Exception e){    //parent class
            System.out.println("exception");
        }
         //the way of handeling exception is varied from exception to exception.
        // so that's y for every exception type there should be a separate catch block is there.
    }
}
