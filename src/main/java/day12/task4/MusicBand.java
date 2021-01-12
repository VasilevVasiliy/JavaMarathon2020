package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> membr;

    MusicBand(String name, int year, List<String> membr) {
        this.name = name;
        this.year = year;
        this.membr = membr;
    }

    public List<String> getMembers() {
        return membr;
    }

    public static void transferMembers(MusicBand mb1, MusicBand mb2) {
        mb2.membr.addAll(mb1.membr);
    }

    public void printMembers() {
        for (String member : getMembers()) {
            System.out.println(member);
        }
    }
}
