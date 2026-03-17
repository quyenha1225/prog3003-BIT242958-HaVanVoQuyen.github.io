package ex_Two;

public class Main {
    public static void main(String[] args) {
        Payment p1 = PaymentFactory.getPayment("credit");
        p1.Pay(1000);

        Payment p2 = PaymentFactory.getPayment("paypal");
        p2.Pay(2000);

        Payment p3 = PaymentFactory.getPayment("cash");
        p3.Pay(500);
    }
}