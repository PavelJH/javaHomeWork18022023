import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ComL1 firt = new ComL1(1,true,"Mama", 2.3);
        ComL1 second = new ComL1(1,false,"Zepp", 17.5);
        ComL1 third = new ComL1(2,true,"Nina", 12.7);
        ComL1 fourth = new ComL1(0,false,"Donny", 3.2);
        List<ComL1> list = new ArrayList<>();
        list.add(firt);
        list.add(second);
        list.add(third);
        list.add(fourth);
        //Queue<Integer> que = new Queue<>();
        Queue<String> que2 = new Queue<>();
        que2.add("fg");
        que2.add("1");
        que2.add("8");
        que2.add("8");
        System.out.println(que2);
        que2.pull();
        System.out.println(que2);

//        System.out.println(list);
//        list.sort((new ComL1Comporator()));
//        System.out.println(list);
//        System.out.println(firt.compareTo(second));
    }


}





/*
Описание занятия: 1. Написать класс с 4 полями
Заипмлементить Comparable по двум полям
Сделать класс implements Comparator по остальным двум полям
Написать реализацию Queue и HashSet с использованием любого Листа
Написать класс Main в котором протестировать работу Queue and Set
    */