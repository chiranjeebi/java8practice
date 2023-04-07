package interfaceenhancement.javabasic.opps;

final class Test { //class is final ->this class is immutable
    private int i; //private variable
    Test(int i){ //constructer
        this.i= this.i;
    }
    public Test modify(int i){ //modify method
        if(this.i==i){
            return this;
        }else {
            return new Test(10);
        }
    }

    public static void main(String[] args) {
        Test t1=new Test(10);
        Test t2=t1.modify(200);
        Test t3=t1.modify(10);
        System.out.println(t1==t2);
        System.out.println(t1==t3);
    }
    //An immutable class is one whose state can not be changed once created.
    //the state of the object essentially means the values stored in the instance variable in class whether
    // they are primitive types or reference types.
}
