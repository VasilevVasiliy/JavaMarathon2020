package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "";
        for (int a = 0; a <= 20000; a++) {
            string = string + " " + a + " ";
        }
        System.out.println(string);

        StringBuilder s = new StringBuilder();
        for (int a = 0; a <= 20000; a++) {
            s.append(a).append(" ");
        }
        System.out.println(s.toString());
    }
}
