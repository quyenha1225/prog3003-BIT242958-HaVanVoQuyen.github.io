package Ex_Two;
import Ex_One.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static double calculateAverageGPA(List<Student> students){
        double sum = 0 ; 
        for(Student s : students){
            sum+= s.getGpa();
        }
        if(students.isEmpty()){
            return 0 ; 
        }else{
            return sum/students.size();
        }
    }
        public static void main(String[] args) {

    StudentManager<Student> manager = new StudentManager<>();
        manager.add(new Student("BIT01", "Ha Van Quyen", 3.2));
        manager.add(new Student("BIT02", "Tran Thi Bao Binh", 3.8));
        manager.add(new Student("BIT03", "Tran Van Quang", 2.9));
        CompletableFuture<Double> future =
            CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return calculateAverageGPA(manager.getAll());
        });

        future.thenAccept(avg ->
        System.out.println("Diem gpa trung binh la : " + avg)
        );
        future.join(); 
        }
}
