package Solving_task_5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

/**
 * task
 */
public class task {

    private static final String[] KeySet = null;

    public static void main(String[] args) {
        
        // Создание "HashMap" словаря
        HashMap<Integer,String> hm_map = new HashMap<>();

        // Добавление значений
        hm_map.put(15, "Blue");
        hm_map.put(42, "Grey");
        hm_map.put(207, "Red");
        hm_map.putIfAbsent(317, "Black");

        // Изменение значений (+ '!')
        Set<Integer> num_key = hm_map.keySet();
        for (Integer key : num_key) {
            hm_map.compute(key,(k,v) -> v = v + "!");
        }


        // Создание "TreeMap" словаря
        TreeMap<Integer,String> hm_treemap = new TreeMap<>();

        // Добавление значений
        String val = "Color";
        Random rnd = new Random();
                
        for (int i = 0; i < 1000; i++) {
            hm_treemap.put(rnd.nextInt(), val);
        }
        

        // Создание "LinkedHashMap" словаря
        LinkedHashMap<Integer,String> hm_linhahmap = new LinkedHashMap<>();

        // Добавление значений
        for (int i = 0; i < 1000; i++) {
            hm_linhahmap.put(rnd.nextInt(), val);
        }
        
        // Измерение времени перебора значений в "TreeMap" и "LinkedHashMap"  

        long start_1 = System.currentTimeMillis();
        Iterator<String> itr_treemap = hm_treemap.values().iterator();
        while(itr_treemap.hasNext()) {
            String v = itr_treemap.next();
            System.out.println(v);
        }
        long end_1 = System.currentTimeMillis();

        System.out.println("Время выполнение перебора через 'TreeMap'");
        System.out.println(end_1 - start_1);
        
        long start_2 = System.currentTimeMillis();
        Iterator<String> itr_linhahmap = hm_linhahmap.values().iterator();
        while(itr_linhahmap.hasNext()) {
            String v = itr_linhahmap.next();
            System.out.println(v);
        }
        long end_2 = System.currentTimeMillis();

        System.out.println("Время выполнение перебора через 'LinkedHashMap'");
        System.out.println(end_2 - start_2);

    }
}