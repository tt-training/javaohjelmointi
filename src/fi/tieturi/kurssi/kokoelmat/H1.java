package fi.tieturi.kurssi.kokoelmat;

import java.util.List;
import java.util.*;

public class H1 {
    public static void main(String[] args) {
        List<String> nimet = new ArrayList<>();
        luoNimet(nimet);

        System.out.println(nimet);

        tulostaYksiKerrallaan(nimet);

        Set<Integer> setti = new HashSet<>();
        setti.add(11);
        setti.addAll(Arrays.asList(1, 4, 7, 9, 34, 32432, 5));
        tulostaYksiKerrallaan(setti);
    }

    private static void luoNimet(List<String> nimet) {
        nimet.add("Tara");
        nimet.add("Catarina");
        Collection<String> nim = Arrays.asList("Robin", "Sandra");
        //nim.add("Tessa");
        nimet.addAll(nim);
    }

    private static void tulostaYksiKerrallaan(Collection<?> kokoelma) {
        for (var alkio: kokoelma) {
            System.out.println(alkio.toString());
        }
    }
}
