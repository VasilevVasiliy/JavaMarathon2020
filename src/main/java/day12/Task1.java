package day12;

import java.util.List;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("Volvo");
        auto.add("Audi");
        auto.add("Kraz");
        auto.add("Fiat");
        auto.add("IJ");

        for (String s : auto) {
            System.out.println(s);
        }

        System.out.println();

        auto.add(3, "Subaru");
        auto.remove(0);

        for (String s : auto) {
            System.out.println(s);
        }
    }
}
