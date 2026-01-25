import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
    
    public void subtract(int a, int b){
        System.out.println("Diff of "+a+" and "+b+" is: "+ (a-b));
    }
    public void mod(int a, int b){
        System.out.println("Mod of "+a+" and "+b+" is: "+ (a%b));
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
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Calculator: ");
        while (true){
            System.out.println("1. add 2. sub 3.Div 4.Mul 5 Mod 0. exit");
            int op = sc.nextInt();
            if(op == 0) exit(0);
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            switch (op){
                case 1:
                    c.addition(a,b);
                    break;
                case 2:
                    c.subtract(a,b);
                    break;
                case 3:
                    c.division(a,b);
                    break;
                case 4:
                    c.multiply(a,b);
                    break;
                case 5:
                    c.mod(a,b);
                    break;
                default:
                    System.out.println("Thanks!");
            }
        }


    }
}
