package inheritance;

interface A{
    void show();
}

interface B{
    void show();
}

class C implements A,B{

    @Override
    public void show() {
        System.out.println("Multiple Inheritance Implemented");

    }
}


public class MultipleInheritance {
    public static void main(String[] args) {

        C c = new C();
        c.show();
    }
}
