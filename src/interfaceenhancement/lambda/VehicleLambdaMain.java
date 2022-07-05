package interfaceenhancement.lambda;

public class VehicleLambdaMain {
    public static void main(String[] args) {

        Vehicle vehicle= ()->System.out.println("vehicle details after lambda"); //using lambda

        vehicle.details();



        Calculator calculator=(Integer a,Integer b)->{return a+b;};
        Integer result =calculator.add(7,9);
        System.out.println("addition using lambda expression :" +result);

        Calculator calculator1=(Integer c,Integer d)->{return c-d;};
    Integer subResult=calculator.subtract(10,5);
        System.out.println("Subtraction using lambda expression :" +subResult); //using default method


    }


}
