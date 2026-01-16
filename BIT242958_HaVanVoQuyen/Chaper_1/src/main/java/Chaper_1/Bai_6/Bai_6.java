package Chaper_1;

import java.util.HashSet;

public class Bai_6 {
    public static void thucHien() {
    Integer[] number = {5,3,6,7,8};
    HashSet<Integer> set = new HashSet<>();
    for(Integer n  : number){
        set.add(n);
         }
    System.out.print("Các phần tử duy nhất trong HashSet" + set );
   // HashSet không chứa phần tử trùng lặp và không sắp xếp theo thứ tự nhập vào.
        // Nó sử dụng bảng băm (hash table) để lưu trữ nên thứ tự in ra có thể thay đổi.
    }
    
}