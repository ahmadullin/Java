package Solving_task_2;

/**
 * task_6
 */
public class task_7 {

    public static void main(String[] args) {
        
        String a = "";
        for (int i = 0; i < 10000; i++) {
            a += "=";
        }

        StringBuilder b = new StringBuilder();
        b.append(a);


        long start_1 = System.currentTimeMillis();

        for (int i = 0; i < b.length() ; i++) {
            b.replace(i, i+1, "р");
        }

        long end_1 = System.currentTimeMillis();

        System.out.println("Время выполнение через StringBuilder");
        System.out.println(end_1 - start_1);


        long start_2 = System.currentTimeMillis();

        a.replace("=", "р");

        long end_2 = System.currentTimeMillis();

        System.out.println("Время выполнение через String");
        System.out.println(end_2 - start_2);
    }
}