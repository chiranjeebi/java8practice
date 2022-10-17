package interfaceenhancement.functionalinterface;

@FunctionalInterface
public interface InterfaceJava8 {
     public void show(); //single Abstract Method
     public default void details(){   // more than 1 default method

    }
    public default void details2(){    // more than 1 default method

    }

     public  static String enquire(){  //more than 1 static method
   return "functional Interface";
     }
    public  static String enquire2(){  //more than 1 static method
        return "functional Interface 2";
    }
}
