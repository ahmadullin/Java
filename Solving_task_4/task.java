package Solving_task_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * task
 */
public class task {

    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        File homeWork = new File("Solving_task_4\\H.W");
        FileWriter fw = null;
        ArrayList<String> list_index = new ArrayList<>();
        ArrayList<String> list_name = new ArrayList<>();
        ArrayList<String> list_surname = new ArrayList<>();
        ArrayList<String> list_patronymic = new ArrayList<>();
        ArrayList<String> list_age = new ArrayList<>();
        ArrayList<String> list_sex = new ArrayList<>(); 

        try {
            // Запись в файл HW.txt
            fw = new FileWriter(homeWork);
            fw
                .append("Ovechkin " + "Alexandr " + "Michailovich " + 39 + " man\n")
                .append("Tarasova " + "Tatiana " + "Anatoleva " + 38 + " woman\n")
                .append("Akhmadullin " + "Kirill " + "Azamatovich " + 25 + " man\n")
                .append("Gagarin " + "Yuriy " + "Alekseevich " + 34 + " man\n")
                .append("Marvanova " + "Asia " + "Ildarovna " + 25 + " woman")
                .flush();

        // Запись в list_index из файла HW.txt
        try (Scanner scanner = new Scanner(homeWork)) {
            while (scanner.hasNextLine()){
                String text = scanner.nextLine();
                list_index.add(text);
            }
        }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Cортировка и запись в списки
        
        // Сортировка по возрасту list_age
        for (int i = 0; i < list_index.size(); i++) {
            list_age.add(list_index.get(i).split(" ")[3]);
        }
        Collections.sort(list_age);

        // Сортировка по возрасту list_name/surname/patronymic/sex
        for (int i = 0; i < list_index.size(); i++) {
            if ((i == 0) || ((i > 0) && (Integer.parseInt(list_age.get(i)) != Integer.parseInt(list_age.get(i-1))))) {
                for (int j = 0; j < list_index.size(); j++) {
                    if (Integer.parseInt(list_index.get(j).split(" ")[3]) == Integer.parseInt(list_age.get(i))) {
                        list_surname.add(list_index.get(j).split(" ")[0]);
                        list_name.add(list_index.get(j).split(" ")[1]);
                        list_patronymic.add(list_index.get(j).split(" ")[2]);
                        list_sex.add(list_index.get(j).split(" ")[4]); 
                    }
                }
            }
            
        }
        Collections.sort(list_age);

        System.out.println("Списки отсортированы по возрасту:");
        System.out.print("Фамилия: ");
        System.out.println(list_surname);
        System.out.print("Имя: ");
        System.out.println(list_name);
        System.out.print("Отчество: ");
        System.out.println(list_patronymic);
        System.out.print("Возраст: ");
        System.out.println(list_age);
        System.out.print("Пол: ");
        System.out.println(list_sex);
    }
}