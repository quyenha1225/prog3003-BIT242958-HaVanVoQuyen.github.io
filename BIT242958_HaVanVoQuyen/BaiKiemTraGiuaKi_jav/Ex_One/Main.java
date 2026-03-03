package Ex_One;
public class Main {
    public static void main(String []args){
        StudentManager<Student> manager = new StudentManager<>();
        manager.add(new Student("SV01", "Ha Van Quyen", 3.2));
        manager.add(new Student("SV02", "Tran Thi Bao Binh", 3.8));
        manager.add(new Student("SV03", "Tran Van Quang", 2.9));
        for(Student s : manager.getAll()){
            System.out.println(s);
        }
    }
}
