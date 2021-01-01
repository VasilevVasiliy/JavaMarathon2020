package day4;

public class Task4 {
    public static void main(String[] args) {
        int array[] = new int[100];

        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 10001);
        }
        int index = 0, max = 0, sum = 0;

        for (int b = 0; b < array.length; b++) {
            if (b < 97) {
                sum = array[b] + array[b++] + array[b + 2];
            }
            if (b == 97) {
                sum = array[97] + array[98] + array[99];
            }
            if (max < sum) {
                max = sum;
                index = b;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
