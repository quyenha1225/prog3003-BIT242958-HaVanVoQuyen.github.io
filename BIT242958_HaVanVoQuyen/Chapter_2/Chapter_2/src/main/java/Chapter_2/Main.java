/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2;
import Chapter_2.Bai_5.DIDemo;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("\n\n\n");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            clearScreen();
            System.out.println("===== MENU TONG HOP =====");
            System.out.println("1. Singleton");
            System.out.println("2. Factory");
            System.out.println("3. Facade");
            System.out.println("4. Strategy");
            System.out.println("5. Dependency Injection");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice = sc.nextInt();
            clearScreen();

            switch (choice) {
                case 1:
                    Singleton.run();
                    break;
                case 2:
                    Factory.run();
                    break;
                case 3:
                    Facade.run();
                    break;
                case 4:
                    StrategyDemo.run();
                    break;
                case 5:
                    DIDemo.run();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }

            if (choice != 0) {
                System.out.println("\nNhan ENTER de quay lai menu...");
                sc.nextLine();
                sc.nextLine();
            }

        } while (choice != 0);

        sc.close();
    }
}

