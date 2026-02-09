package interfaceInJava;

import java.util.Scanner;

interface Payment{
    void pay();
}
interface Card extends Payment {

}
class UPI implements Payment{
    public  void pay(){
        System.out.println("payment done via upi");
    }
}
class NetBanking implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment done by NetBanking");
    }
}
class CreditCard implements Card{

    @Override
    public void pay() {
        System.out.println("Payment done via CreditCard");
    }
}
class DebitCard implements Card{

    @Override
    public void pay() {
        System.out.println("Payment done via DebitCard");
    }
}

class CheckOut {

    void processPayment(Payment payment){
        payment.pay();
    }

}


public class LooseCouplingExample {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment creditCard = new CreditCard();
        Payment debitCard = new DebitCard();
        Payment netBanking = new NetBanking();

        CheckOut checkOut = new CheckOut();

        System.out.println("1.UPI, 2. NetBanking, 3. CreditCard, 4.DebitCard");
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose method to proceed Payment");
        int op = sc.nextInt();
        switch (op){
            case 1: checkOut.processPayment(upi);break;
            case 2: checkOut.processPayment(netBanking);break;
            case 3:checkOut.processPayment(creditCard);break;
            case 4:checkOut.processPayment(debitCard);break;
            default:
                System.out.println("Please select appropriate method to proceed payment.");
        }
    }
}
