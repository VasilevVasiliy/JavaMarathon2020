package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a >= b) System.out.println("Некорректный ввод");

        else {
            for (a++; a < b; a++) {
                if (a % 5 == 0 && a % 10 != 0) System.out.print(a + " ");
            }
        }
    }
}
