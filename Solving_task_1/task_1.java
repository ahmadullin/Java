package Solving_task_1;

import java.util.Arrays;
import java.util.Random;

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {

        Random rnd = new Random();
        int i = rnd.nextInt(2001);
        int n = Integer.toBinaryString(i).length();

        System.out.println();
        System.out.print("Случайное число i = ");
        System.out.println(i);
        System.out.println();
        System.out.print("Номер старшего бита n = ");
        System.out.println(n);
        System.out.println();

        String m1_string = "";
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n == 0) {
                m1_string += Integer.toString(j);
                m1_string += " ";
            }
        }
        String[] m1 = m1_string.split(" ");
        System.out.println("Все кратные n числа в диапазоне от i до Short.MAX_VALUE: ");
        System.out.println(Arrays.toString(m1));
        System.out.println();

        String m2_string = "";
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%n == 1) {
                m2_string += Integer.toString(j);
                m2_string += " ";
            }
        }
        String[] m2 = m2_string.split(" ");
        System.out.println("Все некратные n числа в диапазоне от Short.MIN_VALUE до i: ");
        System.out.println(Arrays.toString(m2));
    }
}