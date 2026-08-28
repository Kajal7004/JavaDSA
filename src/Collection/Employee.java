package Collection;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    
    public int id;
    public String name;
    public int age;
    public String role;

    public Employee(int id, String name, int age, String role) {
        this.id = id;
        this.name = name;
        this.age= age;
        this.role = role;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public int getAge(){
        return age;
    }

    public void setId(int id) {
        this.id = id; 
    }
    public void setName(String name) {
        this.name = name; 
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setRole(String role) {
        this.role = role; 
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id + 
                ", name= " + name +
                ", Age= " + age +
                ", role= " + role +
                '}';
    }

    @Override
    public int compareTo(Employee that) {

        if(this.age==that.age){
            return this.name.compareTo(that.name);
        }
       return this.age - that.age;
    }
}
