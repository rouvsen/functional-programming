package org.example.lambda;

public class Clazz {
    public static void main(String[] args) {
        System.out.println("interface1");
        //interface1
        Interface1 interface1 = () -> 5;
        int value = interface1.f();
        System.out.println(value + "\n"+"interface2");
        //interface2
        Interface2 interface2 = i -> i;
        value = interface2.f(6);
        System.out.println(value + "\n"+"interface3");
        Interface3 interface3 = () -> System.out.println("Hi");
        interface3.f();
    }
}

@FunctionalInterface
interface Interface1{
    int f();
}
@FunctionalInterface
interface Interface2{
    int f(int i);
}
@FunctionalInterface
interface Interface3{
    void f();
}
