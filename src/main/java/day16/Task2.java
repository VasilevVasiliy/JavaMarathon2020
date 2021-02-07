package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("D:\\Java\\JavaMarafet2020\\JavaMarathon2020\\file1");
        File file2 = new File("D:\\Java\\JavaMarafet2020\\JavaMarathon2020\\file2");
        PrintWriter writeNumber = new PrintWriter(file1);
        PrintWriter writeNumber2 = new PrintWriter(file2);
        Random rand = new Random();
        double sum = 0;
        double count = 0;

            for (int a = 0; a < 1000; a++) {
                int i = rand.nextInt(100 );
                writeNumber.println(i);
            }
            writeNumber.close();

            Scanner scan = new Scanner(file1);
            while (scan.hasNextDouble()) {
                double number = scan.nextDouble();
                sum += number;
                count++;
                if (count == 20) {
                    writeNumber2.println(sum / 20);
                    count = 0;
                    sum = 0;
                }
            }
            scan.close();
            writeNumber2.close();

        printResult(file2);
}

    public static void printResult(File file) {
        try {
            Scanner scan2 = new Scanner(file);
            double finalSum = 0.0;
            while (scan2.hasNextLine()) {
               finalSum += Double.parseDouble(scan2.nextLine());
            }
            scan2.close();
            System.out.print((int) finalSum);
        }
        catch (FileNotFoundException e){
            System.out.println("Фаил не найден");
        }
    }
}
