package interfaceInJava;
interface Ex1{
    default void m1(){ // introduced by java8
        System.out.println("default method inside the interface , introduced in Java 9");
    }
    static void m2(){ // introduced by java8
        System.out.println("static method inside the interface , introduced in Java 9");
    }
    private void m3(){ // introduced by java
        System.out.println("private method inside the interface , introduced in Java 9");
    }
    //void m4(){}// we can't implement concrete method inside the interface
}
class A1 implements Ex1{
    void callMethod(){
        m1();
        //ex1.m3();// we can't be called because of private
    }
}
public class MethodImplementationInsideInterfaces {
    public static void main(String[] args) {

        A1 a1 = new A1();
        a1.callMethod();
        Ex1.m2();

    }
}
