package interfaceenhancement.javabasic;

public class CountTheNumberOfOccurrences {
    public static void main(String[] args) {
        String s="this is call of duty ";

        int count= (int) s.chars().filter(i->(char)i=='l').count();

        System.out.println(count);
        //char()->Returns a stream of int zero-extending the char values from this sequence
        //predicate->Returns a stream consisting of the elements of this stream that match the given predicate.
        //count->Returns a stream consisting of the elements of this stream that match the given predicate.
        //This is an intermediate operation.
    }
}
