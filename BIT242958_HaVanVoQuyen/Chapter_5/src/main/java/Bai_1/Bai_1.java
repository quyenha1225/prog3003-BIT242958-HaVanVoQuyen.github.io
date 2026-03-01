package Bai_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Bai_1{

    public static void main(String[] args) {

        // Thông tin kết nối
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_demo";
        String username = "root";
        String password = "123456";

        try {
            // 1. Kết nối CSDL
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công!");

            // 2. Tạo Statement
            Statement stmt = conn.createStatement();

            // 3. Thực thi câu lệnh SELECT
            String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            // 4. Duyệt ResultSet và in dữ liệu
            while (rs.next()) {
                int id = rs.getInt("id");
                String user = rs.getString("username");
                String email = rs.getString("email");

                System.out.println(id + " - " + user + " - " + email);
            }

            // 5. Đóng kết nối
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
