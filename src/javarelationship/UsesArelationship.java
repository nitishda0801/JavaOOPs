package javarelationship;
//Example: Office Worker USES-A Printer.

class Printer{
    void printingdoc(String doc){
        System.out.println("Printing document: "+doc);
    }
}

class OfficeWorker{
    void doWork(){
        Printer printer = new Printer(); //Dependency vai local variable
        printer.printingdoc("Java Book");
        System.out.println("Work done!");

    }
}
public class UsesArelationship {
    public static void main(String[] args) {
        OfficeWorker officeWorker = new OfficeWorker();
        officeWorker.doWork();
    }
}
