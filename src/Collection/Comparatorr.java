package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Comparatorr{

    public static void main(String[] args) {

        Integer[] arr = {4,5,2,43,15,34};
        //Sorting in Ascending Order
        Arrays.sort(arr);
        for(int val:arr){
            System.out.print( +val + " ");
        }

        System.out.println("");
        //Sorting in Decending Order
        Arrays.sort(arr,new ReverseArr());
        for(int val:arr){
            System.out.print( +val + " ");
        }













        // List<Employee> emp  = new ArrayList<>();
        // emp.add(new Employee(101,"Kajal",22,"Developer"));
        // emp.add(new Employee(201,"Vipul",13,"Designer"));
        // emp.add(new Employee(301,"Ankit",13,"SEO"));
        // emp.add(new Employee(401,"Payal",34,"HR"));

        // System.out.println(emp);

        //1st approach
        // Collections.sort(emp);


        //2nd approach
        // Collections.sort(emp, new Comparator<Employee>() {
        //     @Override
        //     public int compare(Employee e1, Employee e2) {
        //         return e1.getAge() - e2.getAge();
        //     }
        // });


        //3rd approach
        // Collections.sort(emp, new AgeComparator());

        // //4th approach
        // Collections.sort(emp, (e1,e2) -> e1.age-e2.age);

        // System.out.println(emp);














        // List<Integer> li = new ArrayList<>();
        // li.add(30);
        // li.add(12);
        // li.add(3);
        // li.add(24);
        // li.add(15);

        // System.out.println(li);
        // // li.sort(null);
        // Collections.sort(li);
        // System.out.println(li);
        // li.sort(Collections.reverseOrder());
        // System.out.println(li);
    }
}