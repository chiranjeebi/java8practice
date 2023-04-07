package interfaceenhancement.stream.example;

import netscape.security.UserTarget;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObject {
    public static void main(String[] args) {

        //creating a stream
        Stream<String> stream = Stream.of("a", "b", "c");

        stream.forEach(System.out::println);


        //creating streams from sources

        Collection<String> collection = Arrays.asList("java", "springboot", "microservice", "j2EE");
        Stream<String> stream2 = collection.stream(); //converting
        stream2.forEach(System.out::println);


        List<String> list=Arrays.asList("java", "springboot", "microservice", "j2EE");
        Stream<String> stream3=collection.stream();
        stream3.forEach(System.out::println); //

        Set<String> set= new HashSet<>(list);
        Stream<String> stream4=set.stream();
        stream4.forEach(System.out::println);


    }







}
