package inheritance;
interface AA{
    void show();
}
interface BB extends AA{

}
interface CC extends AA{

}
class DD implements BB,CC{

    @Override
    public void show() {
        System.out.println("Hybrid Inheritance Implemented");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {

    }
}
