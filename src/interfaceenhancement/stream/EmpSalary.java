package interfaceenhancement.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static javafx.scene.input.KeyCode.L;

public class EmpSalary {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        al.add(1000);
        al.add(2000);
        al.add(4000);
        al.add(6000);
        al.add(500);
        al.add(300);
        al.add(8900);

        List<Integer> list=al.stream().filter(i->i>5000).collect(Collectors.toList());
        System.out.println(  list+" :list of Employee salary above 5000");

        List<Integer> list1=al.stream().filter(i->i<5000).collect(Collectors.toList());

        System.out.println(list1+ ":list of Employee salary below 5000");

        List<Integer> list2=al.stream().filter(i->i>35).collect(Collectors.toList());

        







    }
}
