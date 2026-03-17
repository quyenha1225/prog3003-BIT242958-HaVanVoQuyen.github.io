package ex_Three;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        CompletableFuture<Boolean> auth = CompletableFuture.supplyAsync(() -> {
            sleep(2);
            System.out.println("dang xac thuc...");
            return true;
        });
        CompletableFuture<Boolean> balance = CompletableFuture.supplyAsync(() -> {
            sleep(3);
            System.out.println("dang kiem tra so du...");
            return true;
        });
        CompletableFuture<Void> transaction = auth
            .thenCombine(balance, (a, b) -> {
                if (!a || !b) {
                    throw new RuntimeException("loi xac thuc _ ko du tien ");
                }
                return true;
            })
            .thenAccept(result -> {
                System.out.println("giao dich thanh cong ");
            })
            .exceptionally(ex -> {
                System.out.println("giao dich that bai : " + ex.getMessage());
                return null;
            });

        transaction.join();
    }

    static void sleep(int s) {
        try {
            Thread.sleep(s * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}