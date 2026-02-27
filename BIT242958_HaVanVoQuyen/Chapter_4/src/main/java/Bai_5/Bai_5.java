/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_5;
import java.util.function.Supplier;
import java.util.function.Consumer;
/**
 *
 * @author Asus
 */
public class Bai_5 {
    public static void main(String[]args){
        Supplier<Double> randomSupplier = ()->Math.random()*100;
        
        Consumer<Double> printConsumer = number->
                System.out.println("Số "+ number);
   
        Double luckyNumber = randomSupplier.get();
        printConsumer.accept(luckyNumber);
        
    }
    
}
