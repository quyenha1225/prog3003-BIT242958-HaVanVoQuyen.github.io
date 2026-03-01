/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // 1. Tạo SessionFactory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        // 2. Mở Session
        Session session = factory.getCurrentSession();

        try {
            // 3. Tạo object Product
            Product product = new Product("Laptop", 1500);

            // 4. Bắt đầu transaction
            session.beginTransaction();

            // 5. Lưu xuống database
            session.save(product);

            // 6. Commit
            session.getTransaction().commit();

            System.out.println("Lưu sản phẩm thành công!");

        } finally {
            factory.close();
        }
    }
}
