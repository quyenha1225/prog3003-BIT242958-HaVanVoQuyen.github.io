package ex_One;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm theo tên");
            System.out.println("4. Xóa theo MSSV");
            System.out.println("0. Thoát");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: display(); break;
                case 3: searchByName(); break;
                case 4: deleteByMssv(); break;
                case 0: return;
                default: System.out.println("Sai lựa chọn!");
            }
        }
    }

    static void addStudent() {
        System.out.print("MSSV: ");
        String mssv = sc.nextLine();
        System.out.print("Tên: ");
        String name = sc.nextLine();
        System.out.print("GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();

        list.add(new Student(mssv, name, gpa));
    }

    static void display() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    static void searchByName() {
        System.out.print("Nhập tên: ");
        String keyword = sc.nextLine();

        for (Student s : list) {
            if (s.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    static void deleteByMssv() {
        System.out.print("Nhập MSSV cần xóa: ");
        String id = sc.nextLine();

        list.removeIf(s -> s.getMssv().equals(id));
    }
}