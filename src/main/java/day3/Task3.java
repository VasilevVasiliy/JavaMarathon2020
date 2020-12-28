package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (int x = 0; x<5; x++) {
            Scanner scan = new Scanner(System.in);
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            if(b == 0)  {
                System.out.println("Деление на 0");
               continue;
            }
            System.out.println(a/b);
        }
    }
}
