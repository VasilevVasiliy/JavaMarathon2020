package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int array[] = new int[number];

        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 11);
        }
        System.out.println("Длинна массива: " + array.length);

        int eight = 0, one = 0, even = 0, odd = 0, sum = 0;

        for (int b = 0; b < array.length; b++) {
            if (array[b] > 8) eight += 1;
            if (array[b] == 1) one += 1;
            if (array[b] % 2 == 0) even += 1;
            else odd += 1;
            sum += array[b];
        }
        System.out.println("Количество чисел больше 8: " + eight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
