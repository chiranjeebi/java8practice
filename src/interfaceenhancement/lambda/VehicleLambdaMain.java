package interfaceenhancement.lambda;

public class VehicleLambdaMain {
    public static void main(String[] args) {

        Vehicle vehicle= ()->System.out.println("vehicle details after lambda"); //using lambda

        vehicle.details();



        Calculator calculator=(Integer a,Integer b)->{return a+b;};  //calculator interace hold lamda expression with functional Interface
        Integer result =calculator.add(7,9);
        System.out.println("addition using lambda expression :" +result); //using Functional Interface

        Calculator calculator1=(Integer c,Integer d)->{return c-d;};
    Integer subResult=calculator.subtract(10,5);
        System.out.println("Subtraction using lambda expression :" +subResult); //using default method


        Calculator calculator2=(Integer e,Integer f)->{return e/f;};
         Integer divResult=calculator2.div(10,5);
        System.out.println("Division using lambda expression :" +divResult);

    Calculator calculator3=(Integer g,Integer h)->{return g*h;};
    Integer mulResult= calculator3.mul(6,6);
        System.out.println("multipication using lambda expression :" +mulResult);

    }


}
