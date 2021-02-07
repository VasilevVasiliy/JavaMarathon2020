package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File fileShoes = new File("D:\\Java\\JavaMarafet2020\\JavaMarathon2020\\src\\main\\resources\\shoes.csv");
            File ZeroShoes = new File("D:\\Java\\JavaMarafet2020\\JavaMarathon2020\\src\\main\\resources\\missing_shoes");
            PrintWriter writeShoes = new PrintWriter(ZeroShoes);
            List<String> list = new ArrayList<>();

            Scanner scan = new Scanner(fileShoes);
            while (scan.hasNextLine()) {
                String string = scan.nextLine();
                String[] array = string.split(";");
                if (Integer.parseInt(array[2]) == 0) {
                    list.add(string);
                }
            }
            for (String a : list) {
                writeShoes.println(a);
            }
            writeShoes.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");
        }
    }
}

