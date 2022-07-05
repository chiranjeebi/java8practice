package interfaceenhancement.defaultmethod;

public interface VehicleJava8 {
    default void details(){  //by default availabel to all implementing classes
        System.out.println("hello i am java 8 Default Method");
    }

    void mileage();

}
