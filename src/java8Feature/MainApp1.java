package java8Feature;

import java.util.Optional;

@FunctionalInterface
interface MyInterface
{
    void m1(String name);

    default void m2(){
        System.out.println("This is default method inside interface");
    }
    static void m3(){
        System.out.println("Static method inside interface");
    }
}
//class MyClass implements MyInterface{
//
//    @Override
//    public void m1() {
//        System.out.println("Implementation of abstract method");
//    }
//
//}

public class MainApp1 {
    public static void main(String[] args) {

        MyInterface obj = name -> System.out.println("Hello, "+name);
        obj.m1("Nitish");

        Optional<Object> empty = Optional.of("Java 8 features");

    }
}
