public class Calculator {


    public void subtract(int a, int b){
        System.out.println("Diff of "+a+" and "+b+" is: "+ (a-b));
    }
    public void addition(int a, int b){
        System.out.println("Sum of "+a+" and "+b+" is: "+ (a+b));
    }
    public void division(int a, int b){
        System.out.println("Div of "+a+" and "+b+" is: "+ (a/b));
    }
    public void multiply(int a, int b){
        System.out.println("Multiplication of "+a+" and "+b+" is: "+ (a*b));
    }

    public static void main(String[] args) {

        System.out.println("Calculator: ");

        Calculator c = new Calculator();
        c.addition(10,2);
        c.subtract(10,2);
        c.division(10,2);
        c.multiply(10,2);

    }
}
