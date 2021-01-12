package day12.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> list = new ArrayList<>();

        list.add(new MusicBand("The Queen", 1970));
        list.add(new MusicBand("Nirvana", 1988));
        list.add(new MusicBand("Anathema", 1990));
        list.add(new MusicBand("Estas Tonne", 2002));
        list.add(new MusicBand("Enigma", 1990));
        list.add(new MusicBand("The Wiseguys", 1994));
        list.add(new MusicBand("The Misfits", 1977));
        list.add(new MusicBand("Vertebrae", 2009));
        list.add(new MusicBand("Onyx", 1988));
        list.add(new MusicBand("Jean Baudin", 2008));

        Collections.shuffle(list);

        for (MusicBand mb : list) {
            System.out.println(mb.getName());
        }

        System.out.println();

        for (MusicBand mb : groupsAfter2000(list)) {
            System.out.println(mb.getName());
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> newList = new ArrayList<>();
        for(MusicBand s : bands) {
            if (s.getYear() >= 2000) newList.add(s);
        }
        return newList;
    }

}
