import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hs <T>{
    List<T> list;

    public Hs() {
        list = new ArrayList<>();
    }
    public boolean add(T elem){
        if(! list.contains(elem)){
            list.add(elem);
        return true;
        }
        return false;
    }
    public boolean remove(T elem){
        return list.remove(elem);
    }
    public int size(){
        return list.size();
    }
    public boolean contains(T elem){
        return list.contains(elem);
    }
}
