package javarelationship;
//Example:
    //A Student HAS-A Address
    //Car HAS-A Engine.
class Address{
    //example of HAs-A relationship, where class Student has a class Address.
    String city;
    String state;

    Address(String city1,String state1){
        city = city1;
        state=state1;
    }
    public void getAddressInfo(){
        System.out.println("Address is: "+city +", "+state);
    }
}
class Student{
     String name;
     int rollno;

     Address address = new Address("Kolkata","West Bengal");

     Student(String name1, int rollno1){
         name = name1;
         rollno = rollno1;
     }

     void displayInfo(){
         System.out.println("Name: "+name+", Roll no: "+rollno);
         address.getAddressInfo();
     }

}

public class HasArelationship {
    public static void main(String[] args) {
        Student student = new Student("Nitish",433);
        student.displayInfo();

    }
}
