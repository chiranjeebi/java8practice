package interfaceenhancement.lambda;

@FunctionalInterface
public interface Vehicle {
    void details();
    default void getMileage(){
        System.out.println("Showing mileage details");
    }
}
