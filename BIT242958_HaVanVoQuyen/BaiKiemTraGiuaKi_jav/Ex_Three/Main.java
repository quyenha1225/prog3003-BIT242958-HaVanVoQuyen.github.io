package Ex_Three;
import Ex_Two.*;
import Ex_One.*;
import java.util.Comparator;
import java.util.stream.Stream.*;
import static java.util.Comparator.comparing;
public class Main {
    public static void main(String[]args){
        StudentManager<Student> manager = new StudentManager();
        manager.add(new Student("SV01", "Ha Van Quyen", 3.2));
        manager.add(new Student("SV02", "Tran Thi Bao Binh", 3.8));
        manager.add(new Student("SV03", "Tran Van Quang", 2.9));
        manager.getAll()
                .stream()
                .filter(s->s.getGpa()>=3.2)
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .forEach(System.out::println);
    }
}
