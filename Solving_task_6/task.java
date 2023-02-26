package Solving_task_6;

import java.util.HashMap;

/**
 * task
 */
public class task {

    public static void main(String[] args) {
        My_Set my_set = new My_Set();

        my_set.add(1);
        my_set.add(20);
        my_set.add(4711);
        my_set.add(103);
        my_set.add(704);

        System.out.println(my_set);

        for (int i = 0; i < my_set.size(); i++) {
            System.out.println(my_set.get(i));
        }

    }
}


class My_Set{
    private HashMap<Integer, Object> map = new HashMap<>();

    private final Object OBJ = new Object();

    public boolean add(Integer i){
        map.put(i,OBJ);
        return true;
    }

    @Override
    public String toString(){
        return map.keySet().toString();
    }

    public Integer size(){
        return map.keySet().size();
    }

    public Integer get(Integer i){
        return (Integer) map.keySet().toArray()[i];
    }
}