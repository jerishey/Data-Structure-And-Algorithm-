// Interface
interface Payment {
    void pay(double amount);
}

// Credit Card implementation
class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

// UPI implementation
class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

// Main class
public class Money {
    public static void main(String[] args) {

        Payment payment1 = new CreditCard();
        payment1.pay(1500);

        Payment payment2 = new UPI();
        payment2.pay(500);
    }
}