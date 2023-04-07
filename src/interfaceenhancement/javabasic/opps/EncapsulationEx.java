package interfaceenhancement.javabasic.opps;

public class EncapsulationEx {
     private int sid;
        private String sname;
//mutator methods
        public void setSid(int x)
        {
            this.sid=sid;
        }
        public void setSname(String sname)
        {
            this.sname=sname;
        }
//Accessor methods
        public int getSid()
        {
            return sid;
        }
        public String getSname()
        {
            return sname;
        }


}
class TestEn {
    public static void main(String[] args)
    {
        EncapsulationEx ex=new EncapsulationEx();
        ex.setSid(1);
        ex.setSname("Durga");
        System.out.println(ex.getSid());
        System.out.println(ex.getSname());
    }
    //The process of binding the data and code as a single unit is called Encapsulation.
    //We are able to provide more encapsulation by taking the private data(variables) members.
    //To get and set the values from private members use getters and setters to set the data and to get the data.
}

