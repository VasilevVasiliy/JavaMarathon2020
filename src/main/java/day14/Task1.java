package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File file = new File("text");

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scan = new Scanner(file);
            String string = scan.nextLine();
            String[] numbers = string.split(" ");
            int sum = 0;
            if (numbers.length < 10) {
                throw new NullPointerException();
            } else {
                for (String n : numbers) {
                    sum += Integer.parseInt(n);
                }
                System.out.println(sum);
            }
            scan.close();
        } catch (FileNotFoundException i) {
            System.out.println("Файл не найден");
        } catch (NullPointerException i) {
            System.out.println("Некорректный входной файл");
        }
    }
}
