package Solving_task_3;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        
        System.out.print("\033[H\033[J");
        Scanner in = new Scanner(System.in);

        // 1-е задание (создали список рандомный список строк l1)
        /*
        System.out.println();
        System.out.println("1-е задание (создали список цветов l2)");

        System.out.print("Какое кол-во слов собираетесь вводить? >> ");
        int count = in.nextInt();
        in.nextLine();
        
        ArrayList<String> l1 = new ArrayList<>();
        for (int j = 1; j < (count + 1); j++) {
            System.out.print("Ввод " + (j) + "-ой строки >> ");
            l1.add(in.nextLine());
        };
        System.out.println(l1);
        */


        // 2-е задание (создали список цветов l2 и добавили к каждому элементу "!")
        /*
        System.out.println();
        System.out.println("2-е задание (создали список цветов l2 и добавили к каждому элементу '!'')");
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("red");
        l2.add("orange");
        l2.add("yellow");
        l2.add("green");
        l2.add("blue");
        l2.add("indigo");
        l2.add("violet");        
        
        System.out.println("До >> " + l2);

         for (int j = 0; j < l2.size(); j++) {

            l2.set(j, (l2.get(j) + "!"));
        }
        System.out.println("После >> " + l2);
        */


        // 3-е задание (вставить элемент в список (в моем случаи l2 из задания 2) в первой позиции)
        /*
        System.out.println();
        System.out.println("3-е задание (вставить элемент в список (в моем случаи l2 из задания 2) в первой позиции)");
        
        System.out.print("Ввод >> ");
        l2.add(0, in.nextLine());         
        System.out.println("После ввода, значение перемещено на первую позицию >> " + l2);
        */


        // 4-е задание (извлечь элемент (по указанному индексу) из заданного списка (в моем случаи l2 из задания 2))
        /*
        System.out.println();
        System.out.println("4-е задание (извлечь элемент (по указанному индексу) из заданного списка (в моем случаи l2 из задания 2)");
        
        System.out.print("Введите индекс элемента, который надо извлечь >> ");        
        System.out.println("Элемент >> " + l2.get(in.nextInt()));
        */


        // 5-е задание (обновить определенный элемент списка по заданному индексу (в моем случаи l2 из задания 2))
        /*
        System.out.println();
        System.out.println("4-е задание (обновить определенный элемент списка по заданному индексу (в моем случаи l2 из задания 2)");
        
        System.out.print("Введите индекс элемента, который надо изменить >> ");
        int a = in.nextInt();
        in.nextLine();
        System.out.print("Введите на что хотите изменить >> ");
        String b = in.nextLine();
        l2.set(a, b);        
        System.out.println("После замены элемента >> " + l2);
        */


        // 6-е задание (удалить третий элемент из списка (в моем случаи l2 из задания 2))
        /*
        System.out.println();
        System.out.println("6-е задание (удалить третий элемент из списка (в моем случаи l2 из задания 2))");
        
        l2.remove(2);         
        System.out.println("После удаления >> " + l2);
         */

        
        // 7-е задание (поиска элемента в списке (в моем случаи l2 из задания 2) по строке)
        /*
        System.out.println();
        System.out.println("7-е задание (поиска элемента в списке (в моем случаи l2 из задания 2) по строке)");
        
        System.out.print("Вводите что хотите найти >> ");      
        System.out.println("Индекс элемента >> " + l2.indexOf(in.nextLine()));
        */


        // 8-е задание (создать новый список и добавить в него несколько елементов первого списка (в моем случаи l2 из задания 2))
        /*
        System.out.println();
        System.out.println("8-е задание (создать новый список и добавить в него несколько елементов первого списка (в моем случаи l2 из задания 2))");

        System.out.print("Какое кол-во слов собираетесь вводить? >> ");
        int count = in.nextInt();
        in.nextLine();
        
        ArrayList<String> l3 = new ArrayList<>();
        for (int j = 1; j < (count + 1); j++) {
            System.out.print("Ввод " + (j) + "-ой строки >> ");
            l3.add(in.nextLine());
        };
        System.out.println(l3);
        */

        // 9-е задание (удалить из первого списка (в моем случаи l2 из задания 2) все элементы отсутствующие во втором списке (в моем случаи l3 из задания 2))
        /*
        System.out.println();
        System.out.println("9-е задание (удалить из первого списка (в моем случаи l2 из задания 2) все элементы отсутствующие во втором списке (в моем случаи l3 из задания 2))");
        
        l2.retainAll(l3);
        System.out.println("Результат >> " + l2);
        */

        // 10-е задание (Сортировка списка (в моем случаи l2 из задания 2))
        /* 
        System.out.println();
        System.out.println("10-е задание (Сортировка списка (в моем случаи l2 из задания 2)");
        
        Collections.sort(l2);
        System.out.println("Результат сортировки в алфавитном порядке >> " + l2);
        */
        in.close();
    }
}