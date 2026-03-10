/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_2;

/**
 *
 * @author Asus
 */
public class Computer {
    private String HDD;
    private String RAM ;
    private boolean isBluetoothEnabled;

    public Computer(String HDD, String Ram, boolean isBluetoothEnabled) {
        this.HDD = HDD;
        this.RAM = RAM;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" + "HDD=" + HDD + ", Ram=" + RAM + ", isBluetoothEnabled=" + isBluetoothEnabled + '}';
    }
    public static class ComputerBuilder {

        private String HDD;
        private String RAM;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setBluetoothEnabled(boolean value) {
            this.isBluetoothEnabled = value;
            return this;
        }

        public Computer build() {
            return new Computer(HDD,RAM,isBluetoothEnabled) ;
        }
    }
    
}
