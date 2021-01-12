package day12;

import java.util.List;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int a = 0; a < 31; a++) {
            numbers.add(a);
        }

        for(int a = 300; a < 351; a++) {
            numbers.add(a);
        }

        for (int s : numbers) {
            System.out.println(s);
        }
    }
}
// новыйвый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.