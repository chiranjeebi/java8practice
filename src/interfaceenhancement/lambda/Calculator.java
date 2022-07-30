package interfaceenhancement.lambda;

@FunctionalInterface
public interface Calculator {

    Integer add(Integer num1,Integer num2);    //SAM->single Abstract method
  default Integer subtract(Integer num1,Integer num2){
      return num1-num2;
  }

 default Integer div(Integer num1,Integer num2){
     return num1/num2;
 }

 default Integer mul(Integer num1,Integer num2){
     return num1*num2;
    }
}
