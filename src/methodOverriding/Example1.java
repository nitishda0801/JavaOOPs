package methodOverriding;

class A{
       void m1(){
        System.out.println("method m1 in parent class A");
    }
}

class B extends A{

      void m1(){
          super.m1();
          System.out.println("method m1 in child class B");
    }
}
class C extends B{
    void m1(){
        super.m1();
        System.out.println("method m1 in child class C");
    }
}

public class Example1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.m1();
        A c = new C();
        c.m1();

    }
}
