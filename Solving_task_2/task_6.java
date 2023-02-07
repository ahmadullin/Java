package Solving_task_2;
import java.util.Scanner;
/**
 * task_6
 */
public class task_6 {

    public static void main(String[] args) {
        
        StringBuilder rep = new StringBuilder();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите любую строку содержащую знак '=': ");
        rep.append(in.nextLine());
        in.close();

        int i = rep.indexOf("=");

        rep.replace(i, i+1, "равно");

        System.out.println(rep);
    }
}