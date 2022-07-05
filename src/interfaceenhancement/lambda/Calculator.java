package interfaceenhancement.lambda;

@FunctionalInterface
public interface Calculator {

    Integer add(Integer num1,Integer num2);
  default Integer subtract(Integer num1,Integer num2){
      return num1-num2;
  };


}
