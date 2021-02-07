package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text");

        printResult(file);
    }

    public static void printResult(File file) {
        try {
            double sum = 0;
            Scanner scan = new Scanner(file);
            String str = scan.nextLine();
            String[] numbers = str.split(" ");
            for (String s : numbers) {
                sum += Integer.parseInt(s);
            }
            System.out.println(sum / numbers.length);
            System.out.printf("%.3f", sum / numbers.length);
        }
        catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");
        }
    }
}

