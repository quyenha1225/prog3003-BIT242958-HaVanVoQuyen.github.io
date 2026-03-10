/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_2;


public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetoothEnabled(true)
                .build();

        Computer computer2 = new Computer.ComputerBuilder("500GB", "8GB")
                .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}