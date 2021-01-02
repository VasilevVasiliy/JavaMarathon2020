package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];

        for (int a = 0; a < 12; a++) {
            for (int b = 0; b < 8; b++) {
                array[a][b] = (int) (Math.random() * 51);
            }
        }
        int max = 0, size = 0, index = 0;

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                size += array[a][b];
            }
            if (size >= max) {
                index = a;
                max = size;
            }
            size = 0;
        }
        System.out.println("Ответ: " + index);
    }
}
