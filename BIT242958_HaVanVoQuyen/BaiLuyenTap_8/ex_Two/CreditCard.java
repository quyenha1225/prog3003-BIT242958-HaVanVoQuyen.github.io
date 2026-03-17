/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_Two;

public class CreditCard implements Payment{
    public void Pay(double amount){
        System.out.println("Thanh Toán bằng CreditCard : "+ amount);
    }
}

