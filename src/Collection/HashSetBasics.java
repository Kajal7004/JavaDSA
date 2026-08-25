package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import Collection.Student;

public class HashSetBasics {
    public static void main(String[] args) {
       
        //HashSet preserved output randomly
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        set3.add(3);
        set3.add(4);
        set3.add(5);
        set3.add(6);
        System.out.println(set2);
        System.out.println(set3);

        set2.retainAll(set3);
        System.out.println(set2);

        System.out.println(set2.containsAll(set3));
        System.out.println(set3.containsAll(set2));


        //LinkedHashSet preserved output as you gave
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        System.out.println(set);

        //TreeSet preserved output as a sorted format
        Set<Integer> lhs = new TreeSet<>();
        lhs.add(40);
        lhs.add(10);
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(20);
        System.out.println(lhs);

        HashSet<Student> st = new HashSet<>();

        Student s1  = new Student(1, "Kajal");
        Student s2  = new Student(1, "Kajal");
        Student s3  = new Student(1, "Kajal");

        st.add(s1);
        st.add(s2);
        st.add(s3);

        System.out.println(st);

    }
}