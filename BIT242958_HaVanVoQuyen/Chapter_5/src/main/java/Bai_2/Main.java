/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_2;
import java.sql.*;
import java.util.Scanner;
public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";
    static final String USER = "root";
    static final String PASSWORD = "123456";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id cần xóa:");
        int id = sc.nextInt();

        try (
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM users WHERE id = ?")
        ) {

            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Xóa user thành công!");
            } else {
                System.out.println("Không tìm thấy user để xóa");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}