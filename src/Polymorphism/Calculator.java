package Polymorphism;

public class Calculator {
    public int add (int a, int b){
        return a+b;
    }
    public int add (int a, int b, int c){
        return a + b + c;
    }
    public double add (int a, int b, double c){
        return a + b + c;
    }
    public String add (String a, String b){
        return a + b;
    }
}
