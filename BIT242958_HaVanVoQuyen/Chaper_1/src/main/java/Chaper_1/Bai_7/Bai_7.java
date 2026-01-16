package Chaper_1;

import java.util.TreeSet;

public class Bai_7 {
    public static void thucHien() {
        // 1. Tạo TreeSet và thêm tên
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        // 2. In danh sách và quan sát thứ tự (sẽ là Alice, Bob, John, Zack)
        System.out.println("Danh sách TreeSet (đã sắp xếp): " + names);

        // 3. Lấy phần tử đầu tiên (nhỏ nhất) và cuối cùng (lớn nhất)
        System.out.println("Phần tử đầu tiên: " + names.first());
        System.out.println("Phần tử cuối cùng: " + names.last());
    }
}