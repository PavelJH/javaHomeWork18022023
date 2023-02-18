import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Queue <T> {
    LinkedList<T> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public void add(T elem){
        list.addLast(elem);
    }
    public T pull(){
        if (list.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return list.removeFirst();
    }
    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
