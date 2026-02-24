package java8Feature;

//1. Reference to an Instance Method:
@FunctionalInterface
interface  MyInterface1{
    void greet();
}
class Greetings{
    void sayHello(){
        System.out.println("Hii All from Instance method");
    }
}

//2. Reference to an Instance Method of a Particular Type
@FunctionalInterface
interface  MyInterface2{
    void  displayMsg(String msg);
}

public class MethodReferencesExample {
    public static void main(String[] args) {



        Greetings g = new Greetings();

        // Way 1 : Using Lambda
    MyInterface1 obj1 = ()->g.sayHello();
    obj1.greet();

        // Way 2 : Using Method Reference
    MyInterface1 obj2 = g::sayHello;
    obj2.greet();


    // Way 1: Using Lambda
    MyInterface2 obj = msg -> System.out.println(msg);
    obj.displayMsg("Hello Ji!");

        // Way 2: Using Method Reference
    MyInterface2 ob = System.out::println;
    ob.displayMsg("Hello jii");




    }
}
