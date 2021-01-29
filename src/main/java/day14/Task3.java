package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");

        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> personList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                Person per = new Person();
                String name = scan.nextLine();
                String[] array = name.split(" ");
                if (Integer.parseInt(array[1]) < 0) {
                    throw new NullPointerException();
                }
                per.setName(array[0]);
                per.setYear(Integer.parseInt(array[1]));
                personList.add(per);
            }
            scan.close();
            return personList;
        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");
        } catch (NullPointerException i) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}


