/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_6;
import java.util.Arrays;
import java.util.List;
public class Bai_6 {
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        int num = numbers.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .reduce(0, Integer::sum);
        System.out.println("Tổng "+ num);
    }
    
}
