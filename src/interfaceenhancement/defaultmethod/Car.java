package interfaceenhancement.defaultmethod;

public class Car implements VehicleJava8 {
    public static void main(String[]args){
        Car car=new Car();
        car.details();
    }

    @Override
    public void mileage() {

    }
}
