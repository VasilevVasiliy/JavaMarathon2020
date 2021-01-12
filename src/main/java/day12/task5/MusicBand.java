package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> membr;

    MusicBand(String name, int year, List<MusicArtist> membr) {
        this.name = name;
        this.year = year;
        this.membr = membr;
    }

    public List<MusicArtist> getMembers() {
        return membr;
    }

    public static void transferMembers(MusicBand mb1, MusicBand mb2) {
        mb2.membr.addAll(mb1.membr);
    }

    public void printMembers() {
        for (MusicArtist member : getMembers()) {
            System.out.println(member.getName());
        }
    }
}
