package interfaceInJava;
interface Printable{
    void print();
}
class Document implements Printable{
     public void print(){
        System.out.println("Document printed");
    }
}
//if multiple class have same behavior, then we can use intersace there.

class Image implements Printable{
    public void print(){
        System.out.println("Image printed");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {

    }
}
