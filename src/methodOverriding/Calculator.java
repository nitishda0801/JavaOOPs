package methodOverriding;
abstract class Operation{
        abstract void execute(double a,double b);

}
class Add extends Operation{

    @Override
    void execute(double a, double b) {
        System.out.println("sum: "+(a+b));
    }
}
class Sub extends Operation{

    @Override
    void execute(double a, double b) {
        System.out.println("Sub :"+(a-b));
    }
}
public class Calculator {
    public static void main(String[] args) {
        Operation add = new Add();
        add.execute(1,2);

        Operation sub = new Sub();
        sub.execute(1,2);
    }
}
