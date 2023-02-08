package Solving_task_2;
import java.util.Arrays;
import java.util.Scanner;
/**
 * task_3
 */
public class task_3 {

    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Ввод >> ");
        
        String a_str_1 = in.nextLine();
        char[] a_mas_1 = a_str_1.toCharArray();
        in.close();
        
        int c = 0;

        char[] a_mas_2 = reorder_mas(a_mas_1, c);
        String a_str_2 = Arrays.toString(a_mas_2)
                            .substring(1, 3*a_mas_2.length-1)
                            .replaceAll(", ", "");

        System.out.print("Было: ");
        System.out.println(a_str_1);
        System.out.print("Стало: ");
        System.out.println(a_str_2);
    }

    public static char[] reorder_mas (char[] massive, int i) {
        
        char b = 0;
        if (i < (massive.length/2)){
            b = massive[i];
            massive[i] = massive[massive.length - 1 - i];
            massive[massive.length - 1 - i] = b;
            return reorder_mas(massive, (i+1));
        }
        else{
            return massive;
        }    
    }
}