package methodOverloading;

class CompileTimePolymorphismExample{
    void m1(){
        System.out.println("Info");
    }
    void m1(int age){
        System.out.println("Age: "+age);
    }
    void m1(String str){
        System.out.println("Name: "+str);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        CompileTimePolymorphismExample e = new CompileTimePolymorphismExample();
        e.m1();
        e.m1(26);
        e.m1("Nitish");

    }

}
