package interfaceenhancement.ex.recursion;

public class Prac {
        public static String printName(){
                return printName();
        }

        public static void main(String[] args) {

                String s=new String("chiranjeebi");
               // printName();

                for (int i=0;i<3;i++){
                        System.out.println(s+  "  loop excuted");
if(i==3){
System.out.println(printName() +"here funtion ends");
break;
}
                }
        }

        }
