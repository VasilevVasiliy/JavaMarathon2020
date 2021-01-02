package day4;

public class Task4 {
    public static void main(String[] args) {
        int array[] = new int[100];

        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 10001);
        }
        int array2[] = new int[102];
        System.arraycopy(array, 0, array2, 0, 100);
        int index = 0, max = 0, sum = 0;

        for (int b = 0; b < (array2.length - 2); b++) {
            sum = array2[b] + array2[b++] + array2[b + 2];
            if (max < sum) {
                max = sum;
                index = b;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
