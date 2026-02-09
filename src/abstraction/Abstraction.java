package abstraction;

abstract class Vehicle{
    int no_of_tyres;

    void displayTyres(){
        System.out.println("Total no of tyres: "+no_of_tyres);
    }
    abstract void start();
}
class Car extends Vehicle{

    @Override
    void start() {
        no_of_tyres = 4;
        System.out.println("Car start using key");
    }
}
class Scooter extends Vehicle {

    @Override
    void start(){
        no_of_tyres = 2;
        System.out.println("Scooter start using kick");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.displayTyres();

        System.out.println();

        Vehicle scooter = new Scooter();
        scooter.start();
        scooter.displayTyres();


    }
}



////without using abstraction
//class Car{
//    int no_of_tyres =4;
//    void display_tyres(){
//        System.out.println("Total tyres: "+no_of_tyres);
//    }
//    void start(){
//        System.out.println("start using key");
//    }
//}
//class Scooter {
//    int no_of_tyres =2;
//    void display_tyres(){
//        System.out.println("Total tyres: "+no_of_tyres);
//    }
//    void start(){
//        System.out.println("start using kick");
//    }
//}
//public class Abstraction {
//    public static void main(String[] args) {
//        Car c = new Car();
//        c.display_tyres();
//        c.start();
//
//        Scooter s = new Scooter();
//        s.display_tyres();
//        s.start();
//
//    }
//}
