package Chaper_1.Bai_4;
import java.util.ArrayList;
import java.util.*;
public class Bai_4 {
     public static void ThucHien(){
     List<String> fruits = new ArrayList<>();
     fruits.add("Banana");
     fruits.add("Taso");
     fruits.add("Orange");
     
    fruits.add(1, "Mango");
    int IndexBanana = fruits.indexOf("Banana");
        if(IndexBanana != - 1 ){
            fruits.set(IndexBanana, "Banana");
        }
        System.out.println("Danh Sach Hoa Qua : "+fruits);
        System.out.println("Apple có trong danh sách ko  "+fruits.contains(fruits));
    }  
}