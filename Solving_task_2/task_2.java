package Solving_task_2;
import java.util.Scanner;
/**
 * task_6
 */
public class task_2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        StringBuilder a_str = new StringBuilder();
        System.out.print("Введите 1-ую строку: ");
        a_str.append(in.nextLine());

        StringBuilder b_str = new StringBuilder();
        System.out.print("Введите 2-ую строку: ");
        b_str.append(in.nextLine());
        in.close();

        if (a_str.toString().equals(b_str.reverse().toString())) {
            System.out.println("Эти строки одинаковы слева направо");
        }
        else{
            System.out.println("Эти строки НЕ одинаковы слева направо");
        }
    }
}