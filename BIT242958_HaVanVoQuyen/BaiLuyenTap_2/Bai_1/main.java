/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Bai_1;
import java.util.TreeSet;
public class main {

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
       
        names.add("Join");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");
        System.out.print("Sau khi sắp xếp : ");
        System.out.print(names);
        System.out.println("Phần tử nhỏ nhất: " + names.first());
        System.out.println("Phần tử lớn nhất: " + names.last());
    }
}
