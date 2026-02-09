package interfaceInJava;

interface A{
void a();
}
interface B{
void b();
}
class C implements A,B{
    @Override
    public void a() {
        System.out.println("implemented interface A");
    }

    @Override
    public void b() {
        System.out.println("implemented interface B");

    } // multiple inheritance

}
public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();// here we cannot do like A c = ne w C();
        c.a();c.b();
    }
}
