package day14;

import java.lang.reflect.Array;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args)  {

        File file = new File("people");

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> separate = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String string = scan.nextLine();
                String[] number = string.split(" ");
                if (Integer.parseInt(number[1]) < 0) {
                    throw new NullPointerException();
                }
                separate.add(string);
            }
            scan.close();
        } catch (FileNotFoundException i) {
            System.out.println("Фаил не найден");
        } catch (NullPointerException e) {
            System.out.println("Некорректный входной файл");
            separate = null;
        }
        return separate;
    }
}

