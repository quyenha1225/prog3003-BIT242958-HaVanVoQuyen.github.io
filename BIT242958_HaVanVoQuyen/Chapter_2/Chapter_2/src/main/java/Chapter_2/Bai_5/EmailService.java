/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2.Bai_5;
/**
 *
 * @author Asus
 */
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Gửi Email: " + message);
    }
}
