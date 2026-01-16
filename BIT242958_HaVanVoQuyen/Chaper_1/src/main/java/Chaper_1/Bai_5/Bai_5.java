package Chaper_1;
import java.util.LinkedList;

public class Bai_5 {
    public static void thucHien() {
        // 1 & 2. Tạo LinkedList và thêm 10, 20, 30
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // 3. Thêm 5 vào đầu và 40 vào cuối
        list.addFirst(5);
        list.addLast(40);

        // 4. Xóa phần tử đầu tiên và cuối cùng, sau đó in ra
        list.removeFirst();
        list.removeLast();
        System.out.println("Danh sách LinkedList còn lại: " + list);
    }
}
