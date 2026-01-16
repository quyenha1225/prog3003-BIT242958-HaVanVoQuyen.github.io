package Chaper_1;

import java.util.TreeMap;
import java.util.SortedMap;

public class Bai_9 {
    public static void thucHien() {
        TreeMap<String, Double> products = new TreeMap<>();

        //Thêm các sản phẩm
        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);

        //In danh sách
        System.out.println("Danh sách sản phẩm (đã sắp xếp theo tên): " + products);
        // subMap(fromKey, toKey): lấy từ K (bao gồm) đến M (không bao gồm M)
        SortedMap<String, Double> subList = products.subMap("K", "N");
        System.out.println("Sản phẩm từ chữ K đến M: " + subList);
    }
}