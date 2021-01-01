package day4;

public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[100];

        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 10001);
        }
        int max = 0, min = 0, count = 0, sum = 0;

        for (int numbers : array) {
            if (numbers > max) max = numbers;
            if (numbers < min) min = numbers;
            if (numbers % 10 == 0) {
                sum += numbers;
                count += 1;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемнет массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
