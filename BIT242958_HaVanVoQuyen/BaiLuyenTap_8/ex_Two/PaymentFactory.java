/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_Two;

class PaymentFactory {
    public static Payment getPayment(String type) {
        switch (type.toLowerCase()) {
            case "credit": return new CreditCard();
            case "paypal": return new PayPal();
            case "cash": return new Cash();
            default: throw new IllegalArgumentException("Không hợp lệ!");
        }
    }
}