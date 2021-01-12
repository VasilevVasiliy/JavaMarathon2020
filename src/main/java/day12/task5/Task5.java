package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        MusicBand first = new MusicBand("Nirvana", 1988,
                new ArrayList<MusicArtist>(Arrays.asList(new MusicArtist("Fredie", 40),
                        new MusicArtist("Braien", 38), new MusicArtist("Jhon", 41),
                        new MusicArtist("Rodjer", 39))));

        MusicBand second = new MusicBand("Nirvana", 1988,
                new ArrayList<MusicArtist>(Arrays.asList(new MusicArtist("Kurt", 27),
                        new MusicArtist("Kris", 28), new MusicArtist("Dave", 26))));


        MusicBand.transferMembers(first, second);

        first.printMembers();
        System.out.println();
        second.printMembers();
    }

}