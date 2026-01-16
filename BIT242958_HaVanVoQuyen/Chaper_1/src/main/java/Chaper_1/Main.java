package Chaper_1;

import Chaper_1.Bai_4.Bai_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("         BÀI TẬP LESSON 1          ");
            System.out.println("1. Bài 1: Generic Class (Test)");
            System.out.println("2. Bài 2: Generic Method (printArray)");
            System.out.println("3. Bài 3: Generic Interface (Pair)");
            System.out.println("4. Bài 4 Danh sách hoa quả");
            System.out.println("5. Bài 5: LinkedList (Hàng đợi số)");
            System.out.println("6. Bài 6: HashSet (Loại trùng số nguyên)");
            System.out.println("7. Bài 7: TreeSet (Sắp xếp tên)");
            System.out.println("8. Bài 8: HashMap (Quản lý nhân viên)");
            System.out.println("9. Bài 9: TreeMap (Quản lý sản phẩm)");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            
            
            
            chon = sc.nextInt();
            sc.nextLine(); // Lệnh này để tránh lỗi trôi lệnh khi nhập số xong nhập chữ

            switch (chon) {
                case 1:
                    System.out.println("\nBài_1-");
                    Test<Integer> t1 = new Test<>();
                    t1.set(100);
                    System.out.println("Giá trị Integer: " + t1.get());
                    
                    Test<String> t2 = new Test<>();
                    t2.set("QuyenDePtrai");
                    System.out.println("Giá trị String: " + t2.get());
                    
                    quayVeMenu(sc); // Gọi hàm dừng màn hình
                    break;

                case 2:
                    System.out.println("\n  Bài _ 2");
                    Integer[] intArray = {1, 2, 3, 4, 5};
                    String[] strArray = {"Java", "NetBeans", "Generic"};
                    System.out.println("Mảng số: ");
                    Bai_2.printArray(intArray);
                    System.out.println("Mảng chữ: ");
                    Bai_2.printArray(strArray);
                    
                    quayVeMenu(sc);
                    break;

                case 3:
                    System.out.println("\n--- KẾT QUẢ BÀI 3 ---");
                    OrderedPair<String, Integer> p1 = new OrderedPair<>("MSSV", 10170);
                    OrderedPair<String, String> p2 = new OrderedPair<>("HoTen", "Hà Văn Võ Quyền");
                    System.out.println("Cặp 1: " + p1.getKey() + " -> " + p1.getValue());
                    System.out.println("Cặp 2: " + p2.getKey() + " -> " + p2.getValue());
                    
                    quayVeMenu(sc);
                    break;

                case 4: Bai_4.ThucHien();
                    quayVeMenu(sc);
                    break;
                case 5:
                 Bai_5.thucHien();
                 quayVeMenu(sc);
                    break;
                case 6:
                    Bai_6.thucHien();
                     quayVeMenu(sc);
                        break;
                case 7:
                Bai_7.thucHien();
                quayVeMenu(sc);
                break;
                case 8:
                Bai_8.thucHien();
                quayVeMenu(sc);
                break;
                case 9:
                Bai_9.thucHien();
                quayVeMenu(sc);
                break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn sai, vui lòng nhập lại!");
            }
        } while (chon != 0); 
    }    public static void quayVeMenu(Scanner sc) {
        System.out.println("\n--------------------------------------------");
        System.out.println("4"
                + "Nhấn Enter để quay lại Menu...");
        sc.nextLine(); 
    }
}