package interfaceenhancement.defaultmethod;

public class Bike implements VehicleJava7{
    @Override
    public void details() {
        Bike b =new Bike();
        b.details();
    }

    @Override
    public void Speed() {
        Bike bike=new Bike();
        bike.Speed();
    }
public static void main(String []args){

System.out.println( "hey I am Java 7 method");
}

}
