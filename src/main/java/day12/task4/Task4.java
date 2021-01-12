package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        MusicBand first = new MusicBand("The Queen", 1970,
                new ArrayList<>(Arrays.asList("Fredie", "Braien", "Jhon", "Rodjer")));

        MusicBand second = new MusicBand("Nirvana", 1988,
                new ArrayList<>(Arrays.asList("Kurt", "Kris", "Dave")));

        MusicBand.transferMembers(first, second);

        first.printMembers();
        System.out.println();
        second.printMembers();
    }

}
