/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_4;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> moneyStrings = Arrays.asList("$10", "$20", "$50");

        // Định nghĩa Function để bỏ dấu $ và parseInt
        Function<String, Integer> convertMoney = s -> 
                Integer.parseInt(s.substring(1));

        // Áp dụng function cho từng phần tử
        List<Integer> numbers = moneyStrings.stream()
                .map(convertMoney)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
