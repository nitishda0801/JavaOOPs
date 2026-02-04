package javarelationship;
//Example: A Car IS-A Vehicle.
class Vehicle{
    void start(){
        System.out.println("Vehicle started!");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("Car drive!");
    }
}

public class IsArelationship {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();car.drive();

    }
}
