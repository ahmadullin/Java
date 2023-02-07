package Solving_task_2;
import java.util.Scanner;
/**
 * task_4
 */
public class task_4 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int a = in.nextInt();
        System.out.print("Введите 2-ое число: ");
        int b = in.nextInt();
        in.close();
        
        StringBuilder sum = new StringBuilder();
        sum.append(a).append(" + ").append(b).append(" = ").append(a + b);
        System.out.println(sum);

        StringBuilder diff = new StringBuilder();
        diff.append(a).append(" - ").append(b).append(" = ").append(a - b);
        System.out.println(diff);

        StringBuilder mult = new StringBuilder();
        mult.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(mult);

        StringBuilder div = new StringBuilder();
        String divformat = String.format("%.2f", (float)a / b);
        div.append(a).append(" / ").append(b).append(" = ").append(divformat);
        System.out.print(div);
    }
}