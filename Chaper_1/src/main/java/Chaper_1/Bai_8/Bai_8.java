package Chaper_1;

import java.util.HashMap;

public class Bai_8 {
    public static void thucHien() {
        HashMap<Integer, String> employees = new HashMap<>();
        //  Thêm 3 nhân viên
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");
        System.out.println("Nhân viên có ID 102 là: " + employees.get(102));

        // 4. Kiểm tra ID 105. Nếu không tồn tại, thêm (105, "Unknown")
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }
        
        System.out.println("Danh sách nhân viên hiện tại: " + employees);
    }
}