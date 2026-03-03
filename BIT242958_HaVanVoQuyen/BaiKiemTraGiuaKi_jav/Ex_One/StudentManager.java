package Ex_One;
import java.util.List;
import java.util.ArrayList;
public class StudentManager<T> {
    List<T> data = new ArrayList<>();  
    public void add(T item){
        data.add(item);
    }
    public List<T> getAll(){
        return data;
    }
}
