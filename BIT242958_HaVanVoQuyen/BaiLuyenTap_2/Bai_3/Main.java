package Bai_3;

import java.util.concurrent.CompletableFuture;
public class Main {

    public static void main(String[] args) {

        CompletableFuture<String> validateUser = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("da xac thuc");
            return "khach hang hop le ";
        });
        CompletableFuture<String> issueTicket = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Da xuat ve xem phim");
            return "da xuat ve";
        });

        // Kết hợp 2 tác vụ
        CompletableFuture<String> result = validateUser.thenCombine(issueTicket,
                (user, ticket) -> user + " - " + ticket);

        System.out.println(result.join());
        System.out.println("he thong dat hoan thanh");
    }
}